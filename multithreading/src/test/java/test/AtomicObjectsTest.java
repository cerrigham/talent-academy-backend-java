package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AtomicObjectsTest {

    static Stream<Arguments> counters() {
        int timesPerCounter = 10;
        Stream<IntCounter> intCounters = range(0, timesPerCounter)
                .mapToObj(i -> new IntCounter());
        Stream<AtomicIntegerCounter> atomicIntegerCounters = range(0, timesPerCounter)
                .mapToObj(i -> new AtomicIntegerCounter());
        Stream<Counter> allCounters = Stream.concat(intCounters, atomicIntegerCounters);
        return allCounters.map(Arguments::arguments);
    }


    @ParameterizedTest
    @MethodSource("counters")
    @DisplayName("can use some Atomic object when need to share something")
    void canUseSomeAtomicObjectWhenNeedToShareSomething(Counter counter) throws InterruptedException {
        CountDownLatch waitForStart = new CountDownLatch(1);
        ExecutorService executorService = Executors.newCachedThreadPool();
        range(0, 500)
                .mapToObj(i -> (Callable<Void>) () -> {
                    waitForStart.await();
                    counter.inc(i);
                    return null;
                })
                .forEach(executorService::submit);
        waitForStart.countDown();
        executorService.shutdown();
        assertTrue(executorService.awaitTermination(200, TimeUnit.MILLISECONDS));
        assertEquals(range(0, 500).sum(), counter.value());
    }

    interface Counter {
        int value();

        void inc(int value);
    }

    static class IntCounter implements Counter {
        private int counter;

        @Override
        public int value() {
            return counter;
        }

        @Override
        public void inc(int value) {
            counter += value;
        }

        @Override
        public String toString() {
            return "IntCounter";
        }
    }

    static class AtomicIntegerCounter implements Counter {

        private final AtomicInteger counter = new AtomicInteger(0);

        @Override
        public int value() {
            return counter.get();
        }

        @Override
        public void inc(int value) {
            counter.getAndAdd(value);
        }

        @Override
        public String toString() {
            return "AtomicIntegerCounter";
        }
    }

}

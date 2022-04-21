package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ConcurrentVsParallelTest {

    static <T> List<T> repeat(int times, IntFunction<T> f) {
        return IntStream.range(0, times).mapToObj(f).toList();
    }

    static Stream<Arguments> executorServices() {
        return executorServices(10).map(Arguments::arguments);
    }

    static Stream<Arguments> executorServicesAndSharedResources() {
        return sharedResources(10).flatMap(sharedResource ->
                        executorServices(1).map(executorService ->
                                new Context(sharedResource, executorService)))
                .map(Arguments::arguments);
    }

    static Stream<ExecutorService> executorServices(int timesPerType) {
        Stream<ExecutorService> cachedThreadPool = range(0, timesPerType)
                .mapToObj(i -> Executors.newCachedThreadPool());
        Stream<ExecutorService> fixedThreadPool = range(0, timesPerType)
                .mapToObj(i -> Executors.newFixedThreadPool(8));
        return Stream.concat(cachedThreadPool, fixedThreadPool);
    }

    static Stream<SharedResource> sharedResources(int timesPerType) {
        Stream<SharedResource> unsafeSharedResource = range(0, timesPerType)
                .mapToObj(i -> new UnsafeSharedResource());
        Stream<SharedResource> synchronizedSharedResource = range(0, timesPerType)
                .mapToObj(i -> new SynchronizedSharedResource());
        return Stream.concat(unsafeSharedResource, synchronizedSharedResource);
    }

    @ParameterizedTest
    @MethodSource("executorServices")
    @DisplayName("parallel execution")
    void parallelExecution(ExecutorService executorService) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Queue<Integer> running = new ConcurrentLinkedQueue<>();
        List<Callable<Void>> callables = repeat(100, i -> () -> {
            countDownLatch.await();
            running.add(i);
            return null;
        });
        callables.forEach(executorService::submit);
        countDownLatch.countDown();
        executorService.shutdown();
        assertTrue(executorService.awaitTermination(200, TimeUnit.MILLISECONDS));
        assertEquals(100, running.size());
        System.out.println(running);
    }

    @ParameterizedTest
    @MethodSource("executorServicesAndSharedResources")
    @DisplayName("concurrent access to resource")
    void concurrentAccessToResource(Context context) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService executorService = context.executorService;
        SharedResource sharedResource = context.sharedResource;
        sharedResource.setToZero();
        List<Callable<Void>> callables = repeat(500, i -> () -> {
            countDownLatch.await();
            sharedResource.add(i);
            return null;
        });
        callables.forEach(executorService::submit);
        countDownLatch.countDown();
        executorService.shutdown();
        assertTrue(executorService.awaitTermination(200, TimeUnit.MILLISECONDS));
        assertEquals(124750, sharedResource.value());
    }

    interface SharedResource {

        int value();

        void add(int value);

        void setToZero();
    }

    record Context(SharedResource sharedResource, ExecutorService executorService) {
    }

    static class UnsafeSharedResource implements SharedResource {

        private int value = 0;

        @Override
        public int value() {
            return value;
        }

        @Override
        public void add(int value) {
            this.value += value;
        }

        @Override
        public void setToZero() {
            value = 0;
        }

        @Override
        public String toString() {
            return "UnsafeSharedResource";
        }
    }

    static class SynchronizedSharedResource implements SharedResource {

        private int value = 0;

        @Override
        public int value() {
            return value;
        }

        @Override
        public synchronized void add(int value) {
            this.value += value;
        }

        @Override
        public void setToZero() {
            value = 0;
        }

        @Override
        public String toString() {
            return "SynchronizedSharedResource";
        }
    }

}

package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreadTest {

    @Test
    @DisplayName("how to run a simple thread")
    void howToRunASimpleThread() throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> submitted = executorService.submit(() -> System.out.println("some complex logic..."));
        executorService.shutdown();
        boolean terminated = executorService.awaitTermination(200, TimeUnit.MILLISECONDS);
        assertTrue(terminated);
        assertTrue(submitted.isDone());
    }

    @Test
    @DisplayName("how to run a simple thread that returns a value")
    void howToRunASimpleThreadThatReturnsAValue() throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> submitted = executorService.submit(() -> "the result of some complex logic");
        executorService.shutdown();
        boolean terminated = executorService.awaitTermination(200, TimeUnit.MILLISECONDS);
        assertTrue(terminated);
        assertTrue(submitted.isDone());
        assertEquals("the result of some complex logic", submitted.get());
    }

}

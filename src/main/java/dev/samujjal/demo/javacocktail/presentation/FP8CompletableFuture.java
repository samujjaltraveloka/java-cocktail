package dev.samujjal.demo.javacocktail.presentation;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.*;

@Slf4j
public class FP8CompletableFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<Integer> future = executorService.submit(new Task());

        try {
            Integer integer = future.get();
            System.out.println(integer);
        } catch (InterruptedException | ExecutionException e) {
            log.error("{}", e);
        }

//        CompletableFuture.supplyAsync(() -> getOrder(), executorService)
//        .thenApply();
    }

    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return new Random().nextInt(2000);
        }
    }

    private static Integer getOrder() {
        return 10;
    }
}

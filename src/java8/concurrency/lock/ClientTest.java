package java8.concurrency.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientTest {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(2);

            final Counter counter = new Counter();

            Runnable task1 = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }
                }
            };

            Runnable task2 = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 2000; i++) {
                        counter.increment();
                    }
                }
            };

            executorService.submit(task1);
            executorService.submit(task2);

            executorService.awaitTermination(3, TimeUnit.SECONDS);

            System.out.println(counter.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }

    }
}

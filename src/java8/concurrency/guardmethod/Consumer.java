package java8.concurrency.guardmethod;

import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (String message = drop.take();
                !"DONE".equalsIgnoreCase(message);
                message = drop.take()) {

            System.out.format("Message Received :------> %s%n", message);

            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                // Do Nothing
            }
        }
    }
}

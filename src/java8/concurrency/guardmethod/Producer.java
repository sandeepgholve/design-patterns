package java8.concurrency.guardmethod;

import java.util.Random;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        String impMessages[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        Random random = new Random();

        for (String impMessage : impMessages) {
            drop.put(impMessage);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                // Do nothing
            }
        }

        drop.put("DONE");
    }
}

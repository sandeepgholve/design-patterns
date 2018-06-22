package java8.concurrency.guardmethod;

public class Drop {
    // Message sent from Producer to Consumer
    private String message;

    // True, if Consumer should wait for Producer to send a message. Ans False, if Producer should wait for
    // Consumer to retrieve message.
    private boolean empty = true;

    public synchronized String take() {
        // Wait until message is available
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                // Do nothing
            }
        }

        // Toggle status
        empty = true;
        // Notify Producer that status has changed.
        notifyAll();
        return message;
    }

    public synchronized void put(final String message) {
        // Wait until message has been consumed/retrieved by Consumer
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                // Do nothing
            }
        }

        // Toggle status
        empty = false;
        // Store message
        this.message = message;
        // Notify consumer that status has changed.
        notifyAll();
    }
}

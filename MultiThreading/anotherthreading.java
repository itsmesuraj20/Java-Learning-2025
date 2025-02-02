package MultiThreading;

class Counter {
    private int count = 0;
    private final int MAX_COUNT = 5;

    // Synchronized method to increment counter
    public synchronized void increment() throws InterruptedException {
        while (count >= MAX_COUNT) {
            wait();
        }
        count++;
        System.out.println("Producer increased count to: " + count);
        notify();
    }

    // Synchronized method to decrement counter
    public synchronized void decrement() throws InterruptedException {
        while (count <= 0) {
            wait();
        }
        count--;
        System.out.println("Consumer decreased count to: " + count);
        notify();
    }
}

class Producer implements Runnable {
    private Counter counter;

    public Producer(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private Counter counter;

    public Consumer(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                counter.decrement();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class anotherthreading {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread producerThread = new Thread(new Producer(counter), "Producer");
        Thread consumerThread = new Thread(new Consumer(counter), "Consumer");

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}

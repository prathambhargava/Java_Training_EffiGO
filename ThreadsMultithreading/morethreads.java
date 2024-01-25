package ThreadsMultithreading;

public class morethreads extends Thread {
    public static int count = 0;
    public static void main(String[] args) {
        morethreads thread = new morethreads();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
        System.out.println("Waiting...");
    }
    // Update amount and print its value
    System.out.println("Main: " + count);
    count++;
    System.out.println("Main: " + count);
    }
    public void run() {
        count++;
    }
}
    


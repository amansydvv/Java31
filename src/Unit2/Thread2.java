package Unit2;

public class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    Thread.sleep(2000); // Sleep for 2 seconds
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Thread2 t = new Thread2();
        t.start(); // start the thread
    }
}

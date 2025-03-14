public class ThreadExample {
    static class AscendingThread extends Thread {
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }


    static class DescendingRunnable implements Runnable {
        public void run() {
            for (int i = 100; i >= 1; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(10);  
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {

        AscendingThread ascendingThread = new AscendingThread();
        ascendingThread.start();


        Thread descendingThread = new Thread(new DescendingRunnable());
        descendingThread.start();
    }
}

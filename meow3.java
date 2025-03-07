class A implements Runnable {
    String threadname;

    public A(String tname) {
        this.threadname = tname;
    }

    public void run() {
        for (int i  = 0; i < 300; i++) {
            System.out.println("Threadname: " + threadname + " Iteration: " + i*2);
        }
    }
}

class B implements Runnable {
    String threadname;

    public B(String tname) {
        this.threadname = tname;
    }

    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("Threadname: " + threadname + " Iteration: " + i*2);
        }
    }
}

public class meow3 {
    public static void main(String[] args) {
        A threadA = new A("Thread A");
        B threadB = new B("Thread B");

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);

        t1.start();
        t2.start();
    }
}

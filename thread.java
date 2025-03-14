class A implements Runnable {
    String threadname;

    public A(String tname) {
        this.threadname = tname;
    }

    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("threadname: " + threadname + " " + i * 2);
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
            System.out.println("threadname: " + threadname + " " + i * 2);
        }
    }
}

class thread {
    public static void main(String[] args) {
        A a1 = new A("thread a");
        B b1 = new B("thread b");

        Thread thread1 = new Thread(a1); 
        Thread thread2 = new Thread(b1); 

        thread1.start(); 
        thread2.start(); 

    }
}

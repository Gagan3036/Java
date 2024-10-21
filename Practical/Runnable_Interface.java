class MyThread implements Runnable{
    public void run() {
        System.out.println("Thread is under Running...");
        for(int i= 1; i<=10; i++) {
            System.out.println("i = " + i);
        }
    }
    }
    public class Runnable_Interface {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            Thread t2 = new Thread(t1);
            System.out.println("Thread about to start...");
            t2.start();
    }
}
/*
 * Output:-

Thread about to start...
Thread is under Running...
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7
i = 8
i = 9
i = 10
 */
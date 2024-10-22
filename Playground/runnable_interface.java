class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is under Runnnig...");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = "+i);
        }
    }
}

public class runnable_interface {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
    }
}

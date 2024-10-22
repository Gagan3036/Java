class Multithreading extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is runnig");
        } catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class multi_thread {
    public static void main(String[] args){
        int n = 8;
        for (int i =0; i < n; i++){
            Multithreading obj = new Multithreading();
            obj.start();
        }
    }
}

class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
public class Multithread {
    public static void main(String[] args){
    int n = 8; 
    for (int i = 0; i < n; i++) {
        MultithreadingDemo object = new MultithreadingDemo();
        object.start();
    }
    }
}
/*
 * Output:-
PS C:\Users\gagan\Documents\Repository\Java\Experiements\Ex-13> cd "c:\Users\gagan\Documents\Repository\Java\Experiements\Ex-13\" ; if ($?) { javac Multithread.java } ; if ($?) { java Multithread }
Thread 13 is running
Thread 19 is running
Thread 16 is running
Thread 18 is running
Thread 14 is running
Thread 20 is running
Thread 15 is running
Thread 17 is running
 */
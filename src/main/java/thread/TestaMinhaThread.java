package thread;

public class TestaMinhaThread {

    public static void main(String[] args) {
        MinhaThread mt1 = new MinhaThread("Thread 1");
        Thread t1 = new Thread(mt1);
        MinhaThread mt2 = new MinhaThread("Thread 2");
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
        }
        System.out.println("Main terminou");

    }
}

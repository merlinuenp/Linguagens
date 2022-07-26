package thread;

public class TestaMinhaThread {

    public static void main(String[] args) {
        MinhaThread mt1 = new MinhaThread("Thread 1");
        MinhaThread mt2 = new MinhaThread("Thread 2");
        mt1.start();
        mt2.start();
        mt2.setPriority(10);
        
        
        try {
            mt1.join();
            mt2.join();
        } catch (InterruptedException ex) {
        }
        System.out.println("Main terminou");

    }
}

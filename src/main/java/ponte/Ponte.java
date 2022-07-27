package ponte;

public class Ponte {
    
    public synchronized void atravessar(Veiculo v) throws InterruptedException{
        System.out.println(v.getName()+ " está passando");
        Thread.sleep(1000);
        System.out.println("");
    }
}

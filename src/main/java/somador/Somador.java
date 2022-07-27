package somador;


public class Somador extends Thread {
    private int v[];
    private volatile int soma; 
    
    public Somador(int v[]){
        this.v = v; 
    }
    
    @Override
    public void run(){
        int total = 0;
        for(int i : v){
            total += i; 
        }
        soma = total; 
    }
    
    public int getSoma(){
        return soma; 
    }
}

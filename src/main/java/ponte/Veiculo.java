package ponte;


public class Veiculo extends Thread {
    Ponte ponte;
    
    public Veiculo(String nome, Ponte p){
        this.setName(nome);
        this.ponte = p;
    }
    
    @Override
    public void run(){
        try {
            ponte.atravessar(this);
        } catch (InterruptedException ex) {
            
        }
    }
   
    
}
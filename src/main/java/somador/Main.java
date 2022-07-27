package somador;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int v[] = new int[1_000_000]; 
        for (int i = 0; i < 1_000_000; i++){
            v[i] = random.nextInt();
        }     
         
        int v2[] = new int[1_000_000]; 
        for (int i = 0; i < 1_000_000; i++){
            v2[i] = random.nextInt();
        }
        
        Somador s1 = new Somador(v);
        Somador s2 = new Somador(v2); 
        s1.start();
        s2.start();
        s1.join();
        s2.join();
        System.out.println(s1.getSoma() + s2.getSoma());
        
        
         
//        long inicio = System.currentTimeMillis();
//        int soma1 = 0;
//        for (int i = 0; i < 1_000_000; i++){
//            soma1 += v[i];
//        }
//        int soma2 = 0;
//        for (int i = 0; i < 1_000_000; i++){
//            soma2 += v2[i];
//        }
//        System.out.println(soma1 + soma2);
//        System.out.println(System.currentTimeMillis() - inicio);
                
       
    }
}

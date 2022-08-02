package paralelo;

import java.util.concurrent.ForkJoinPool;

public class RoboParaleloTeste {

    public static void main(String[] args) {
        

//        // Robo paralelo
//        inicio = System.currentTimeMillis();
//        RoboParalelo conta = new RoboParalelo(10, 10, false);
//        long total = conta.compute();
//        System.out.println(total);
//        System.out.println("Robô paralelo....: " + (System.currentTimeMillis() - inicio));

        RoboParalelo rob = new RoboParalelo(20, 20, false);
        long inicio = System.currentTimeMillis();
        ForkJoinPool pool = ForkJoinPool.commonPool();
        long soma = pool.invoke(rob);
        System.out.println("Soma: "+ soma);
        System.out.println("Robô paralelo ...: " + (System.currentTimeMillis() - inicio)+ " milisegundos.");
        
        // Robo convencional
        long inicio2 = System.currentTimeMillis();
        System.out.println("Caminhos (20, 20): " + (Robo.contar(20, 20)));
        System.out.println("Robô convencional: " + (System.currentTimeMillis() - inicio2) + " milisegundos.");

    }
}

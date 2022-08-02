package paralelo;

import java.io.IOException;
import java.util.concurrent.ForkJoinPool;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

public class RoboTeste {
    
    public static void main(String[] args) throws IOException {
     org.openjdk.jmh.Main.main(args);
    }
    
    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.AverageTime)
    public void testaConvencional(){
        Robo.contar(10, 10);
    }
    
    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.AverageTime)
    public void testaParalelo(){
        RoboParalelo rob = new RoboParalelo(10, 10, false);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        long soma = pool.invoke(rob);
    }
}

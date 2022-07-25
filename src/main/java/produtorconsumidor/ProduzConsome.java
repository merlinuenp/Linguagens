package produtorconsumidor;

public class ProduzConsome {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(100);
        Produtor produtor1 = new Produtor(buffer);
        Consumidor consumidor1 = new Consumidor(buffer);
        produtor1.start();
        consumidor1.start();
    }
}

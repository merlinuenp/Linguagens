package thread;

public class MinhaThread implements Runnable {
    private String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        //Random random = new Random();
        System.out.println("Iniciou o run() " + nome);
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
                System.out.println("Na " + nome + " " + i);
            } catch (InterruptedException ex) {
            }

        }
        System.out.println(nome + " terminou");
    }
}

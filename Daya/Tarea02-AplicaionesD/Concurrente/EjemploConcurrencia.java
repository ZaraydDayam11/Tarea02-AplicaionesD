package Concurrente;

public class EjemploConcurrencia implements Runnable {

    private int inicio;
    private int fin;

    public EjemploConcurrencia(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public void run() {
        for (int i = inicio; i <= fin; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new EjemploConcurrencia(1, 50));
        Thread hilo2 = new Thread(new EjemploConcurrencia(51, 100));
        hilo1.start();
        hilo2.start();
    }
}

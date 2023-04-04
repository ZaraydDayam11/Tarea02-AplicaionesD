package Paralelo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjemploParalelo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 10; i++) {
            executor.execute(new FactorialTask(i));
        }
        executor.shutdown();
    }
}

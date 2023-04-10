package Paralelo;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
    private int n;

    public FactorialTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        BigInteger result = BigInteger.ONE;    
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial de " + n + ": " + result);
    }
}

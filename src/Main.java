public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(10,"Lazy");
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(10,"Optimized");

        Thread thread1 = new Thread(lazyPrimeFactorization);
        Thread thread2 = new Thread(optimizedPrimeFactorization);

        thread1.start();
        thread2.start();
    }
}

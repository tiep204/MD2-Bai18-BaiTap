public class Main {
    public static void main(String[] args) throws InterruptedException {
       LazyPrimeFatorization lz = new LazyPrimeFatorization();
       OptimizedPrimeFactorization op = new OptimizedPrimeFactorization();
        Thread thread = new Thread(lz);
        Thread thread1 = new Thread(op);
        thread.start();
        thread.join();
        thread1.start();
    }
}
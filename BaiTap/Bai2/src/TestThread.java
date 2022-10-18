public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread sole = new OddThread();
        EvenThread sochan = new EvenThread();
        Thread threadChan = new Thread(sochan);
        Thread thread = new Thread(sole);

        thread.start();
        thread.join();
        threadChan.start();
    }
}

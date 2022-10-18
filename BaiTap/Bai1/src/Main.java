public class Main {
    public static void main(String[] args) {
        NumberGenerator chay = new NumberGenerator();
        Thread thread = new Thread(chay);
        thread.start();
    }
}
public class NumberGenerator implements Runnable {
    private Thread soTuNhien;
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("so: "+i);
                Thread.sleep(500);
            }

        }catch (InterruptedException e){
            System.out.println("luong bi gian doan ");
        }
        System.out.println("choi chay so tu nhien cua toi da ket thuc");

    }
}

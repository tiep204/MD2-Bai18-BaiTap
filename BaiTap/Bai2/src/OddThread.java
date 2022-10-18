public class OddThread extends Thread {
    public OddThread() {
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(i%2!=0){
                    System.out.println("so le la: "+i);
                }
            }


        }catch (Exception e){
            System.out.println("luong nay bi gian doan: ");
        }
        System.out.println("luong so le cua ban da ket thuc: ");
    }
}

public class EvenThread extends Thread{
    public EvenThread() {
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(i%2==0){
                    System.out.println("so chan la: "+i);
                }
            }
        }catch (Exception e){
            System.out.println("luong bi gian doan: ");
        }
        System.out.println("luong so chan da ket thuc: ");
    }
}

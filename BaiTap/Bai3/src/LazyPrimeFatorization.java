public class LazyPrimeFatorization implements Runnable{
    public LazyPrimeFatorization() {
    }

    @Override
    public void run() {
        System.out.println("so nguyen to cua ban la: ");
        int cnt = 0;
        int N = 2;
        while (cnt != 20){
            boolean check = false;
            for (int i = 2; i < N; i++) {
                if(N%i==0){
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.println(N);
                cnt++;
            }
            N++;
            try {
                Thread.sleep(100);
            }catch (InterruptedException e ){
                throw new RuntimeException(e);
            }

        }
        System.out.println("luong cua ban da ket thuc: ");
    }
}

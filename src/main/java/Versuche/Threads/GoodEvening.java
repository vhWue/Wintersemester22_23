package Versuche.Threads;

public class GoodEvening implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Good Evening");
                Thread.sleep(500);
            } catch(Exception e){
            e.printStackTrace();
            }
        }
    }
}

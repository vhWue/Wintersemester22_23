package Versuche.Threads;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        HelloWorld testClass = new HelloWorld();
        GoodEvening gD = new GoodEvening();
        Thread t = new Thread(testClass);
        Thread t2 = new Thread(gD);


      /*  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try{
                        System.out.println("Anoynymous");
                        Thread.sleep(4000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();*/

        runThread("Viktor",1000);
        runThread("Max",3000);
    }

    static void runThread(String msg, int sleep) {
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("Hi "+msg);
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}

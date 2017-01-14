package main.java.Runable;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

public class RunnableLambda {

    public static void main(String[] args) throws InterruptedException {

//        RunnableImpl runnable = new RunnableImpl();


        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i=0; i<3; i++){
                    System.out.println("HELLO WORLD FROM THREAD [" +
                    Thread.currentThread().getName() + "]");
                }
            }
        };*/

        Runnable runnable = () -> {

            for (int i = 0; i < 3; i++) {
                System.out.println("HELLO WORLD FROM THREAD [" +
                        Thread.currentThread().getName() + "]");
            }
        };


        Thread t = new Thread(runnable);
        t.start();
        t.join();

    }
}

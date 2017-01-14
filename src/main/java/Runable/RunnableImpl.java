package main.java.Runable;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("HELLO WORLD FROM THREAD [" +
                    Thread.currentThread().getName() + "]");
        }
    }
}

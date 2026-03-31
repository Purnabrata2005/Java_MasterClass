package java_basics.multiThreading;

public class NumberCounter1 implements Runnable {

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

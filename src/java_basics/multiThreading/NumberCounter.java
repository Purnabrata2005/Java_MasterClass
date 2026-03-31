package java_basics.multiThreading;

public class NumberCounter extends Thread {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(sum + i);
        }
    }
}

package java_basics.multiThreading;

public class withMultiThreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        NumberCounter nc = new NumberCounter();


        NumberCounter1 nc2 = new NumberCounter1();
        Thread t1 = new Thread(nc2);

        nc.start();
        t1.start();

        try {
            nc.join();
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - start));

    }
}

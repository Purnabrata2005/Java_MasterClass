package java_basics.multiThreading;

public class withoutmultiThreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(sum+i);
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - start));

    }
}

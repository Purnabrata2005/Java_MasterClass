package ExtraKnowledge;

import java.lang.ref.WeakReference;

public class GarbageCollector {
    public static void main(String[] args) {
//        Phone p1 = new Phone("Apple", "16Pro max");
//        System.out.println(p1);
//        p1  = null;
//        System.out.println(p1);

        WeakReference<Phone> weakReference = new WeakReference<>(new Phone("Apple", "16Pro max"));
        System.out.println(weakReference.get());
        System.gc();

        try {
            Thread.sleep(10000);
        } catch (Exception ignored) {

        }

        System.out.println(weakReference.get());
    }
}

class Phone {
    String Brand;
    String Model;

    public Phone(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}

package Map;

import java.util.WeakHashMap;

public class weakHashMap {
    public static void main(String[] args) {
        WeakHashMap<Integer, Image> ImageCache = new WeakHashMap<>();

        ImageCache.put(1, new Image("Img1.jpg"));
        ImageCache.put(2, new Image("Img2.jpg"));
        ImageCache.put(3, new Image("Img3.jpg"));
        ImageCache.put(4, new Image("Img4.jpg"));
        ImageCache.put(5, new Image("Img5.jpg"));

        System.out.println(ImageCache);
        System.gc();
        simulateApplicationRunning();


        System.out.println("Cache After Clear :" + ImageCache);


    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating Application Running");
            Thread.sleep(5000);
            System.gc();
        } catch (Exception e) {
        }
    }
}

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + '\'';

    }
}

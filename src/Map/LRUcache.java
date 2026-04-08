package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUcache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }


    public static void main(String[] args) {
        LRUcache<String, Integer> StudentMap = new LRUcache<String,Integer>(3);

        StudentMap.put("Orange", 10);
        StudentMap.put("Red", 20);
        StudentMap.put("Green", 30);
        StudentMap.put("Blue", 40);
        StudentMap.put("Yellow", 50);

        System.out.println(StudentMap);


    }
}

package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();// Maintain the output (using Double linkedlist)
//        HashMap<String, Integer> map = new HashMap<>(); // no order maintain output like
//        Mango:30
//        Orange:10
//        Banana:20
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Mango", 30);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

package Map;

import java.util.HashMap;

public class example_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> fruitMap = new HashMap<>();
 // example of collision
        fruitMap.put("Apple",50);
        fruitMap.put("Orange",20);
        fruitMap.put("Banana",30);
        fruitMap.put("Grape",80);

        System.out.println(fruitMap);
    }
}

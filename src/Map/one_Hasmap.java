package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class one_Hasmap {
    public static void main(String[] args) {
        HashMap<Integer, String> shopingList = new HashMap<Integer, String>();

        shopingList.put(1,"Apple");
        shopingList.put(2,"Banana");
        shopingList.put(3,"Pear");
        // shopingList.put(null,"Pineapple"); //no duplicate entry
        shopingList.put(null,"Mango ");

        System.out.println(shopingList);

        String item = shopingList.get(3);
        System.out.println(item);

        System.out.println(shopingList.containsKey(3)); // complexity O(1) 

//        Set<Integer> integers = shopingList.keySet();
//        for (int i :integers){
//            System.out.println(shopingList.get(i));
//        }

        Set<Map.Entry<Integer, String>> entries = shopingList.entrySet();

        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(shopingList);

    }
}

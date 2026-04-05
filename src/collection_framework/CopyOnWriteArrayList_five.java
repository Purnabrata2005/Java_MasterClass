package collection_framework;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_five {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        //when read is most

        List<String> shopingList = new CopyOnWriteArrayList<>();

        shopingList.add("Milk");
        shopingList.add("Potato");
        shopingList.add("Cheese");
        shopingList.add("onion");

        System.out.println("Initial list: " + shopingList);

        for (String items : shopingList) {
            System.out.println(items);
            if (items.equals("Milk")) {
                shopingList.add("suger");
            }
        }

        System.out.println("Updated list: " + shopingList);
    }
}

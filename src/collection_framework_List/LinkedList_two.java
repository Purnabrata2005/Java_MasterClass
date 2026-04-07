package collection_framework_List;

import java.util.LinkedList;

public class LinkedList_two {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();

        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);

//        int list =linkList.get(3);

        linkList.addFirst(5);
        linkList.addLast(6);

        linkList.getFirst();
        linkList.getLast();
        linkList.removeFirst();
        linkList.removeLast();

        System.out.println(linkList);

        linkList.removeIf(x -> x % 2 != 0);
        System.out.println(linkList);
    }
}

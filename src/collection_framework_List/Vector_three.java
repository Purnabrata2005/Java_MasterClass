package collection_framework_List;

import java.util.Arrays;
import java.util.Vector;

public class Vector_three {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(5,3);//If we don't give capacity then it increment 2 times of initial capacity

        Vector<Integer> v2 = new Vector<>(Arrays.asList(1,2,3)); // in we pass a collection  like ArrayList LinkList

        System.out.println(v2);
    }
}

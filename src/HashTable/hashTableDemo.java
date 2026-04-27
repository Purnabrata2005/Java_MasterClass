package HashTable;

import org.w3c.dom.ls.LSOutput;

import java.util.Hashtable;

public class hashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String > hashTable = new Hashtable<>(); // Thread safe

        hashTable.put(1,"apple");
        hashTable.put(2,"banana");
        hashTable.put(3,"mango");

        System.out.println(hashTable);
    }
}

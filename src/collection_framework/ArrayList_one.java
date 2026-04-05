package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class ArrayList_one {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        System.out.println("Size: " + list.size());

        for (int x : list) {
            System.out.println(x);
        }

        System.out.println(list.contains(1));

        list.remove(1);
        System.out.println(list);
        list.add(1, 4);//in index add element
        list.set(1, 50);//in index replace element
        System.out.println(list);

        //asList //in this we don't add or remove the value only change it
        List<String> items = Arrays.asList("Monday", "Sunday");

        System.out.println(items);

        List<String> items1 = new ArrayList<>(items);
        items1.add("Monday");
        System.out.println(items1);

        List<Integer> integers = List.of(1, 2, 3);//no modification
        System.out.println(integers);

        //converting to Array

        Object[] array = integers.toArray();

        String[] array1 = items1.toArray(new String[0]);


        //comparator

        ArrayList<Integer> integers1 = new ArrayList<>();

        integers1.add(1);
        integers1.add(2);
        integers1.add(3);

        integers1.sort(new Mycomparator());

        System.out.println(integers1);

        ArrayList<String> strings1 = new ArrayList<>();

        strings1.add("Apple");
        strings1.add("Mango");
        strings1.add("banana");

        strings1.sort(new StringLengthComparator());

        System.out.println(strings1);


        //lamda expression

        ArrayList<String> strings2 = new ArrayList<>();

        strings2.add("Apple");
        strings2.add("Mango");
        strings2.add("banana");
        strings2.add("lichi");

        strings2.sort((a, b) -> a.length() - b.length());
        System.out.println(strings2);


        //

        ArrayList<Students> students = new ArrayList<>();

        students.add(new Students("Purna", 8.5));
        students.add(new Students("Nandan", 9.0));
        students.add(new Students("Rana", 9.5));
        students.add(new Students("Sanu", 8.0));

        students.sort((a, b) -> {
            if (b.getScore() - a.getScore() < 0) {
                return -1;
            } else if (b.getScore() - a.getScore() > 0) {
                return 1;
            } else {
                return 0;
            }
        });

        for (Students S : students) {
            System.out.println(S.getName() + ":" + S.getScore());
        }


        //use comparator method
        //java 1.8 maybe
    }
}


class Mycomparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        /*
        if return negative then o1 come first
        if positive then o2 come first
        if same then consider equal
         */

        // assending order
        //  return o1 - o2;

        // desending order
        return o2 - o1;


    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

class Students {
    private String name;
    private double score;

    public Students(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}





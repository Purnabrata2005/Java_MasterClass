package java_basics.data_types;

public class one_String {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = new String("Hello World");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);//use to  check same reference or not
        System.out.println(str1.equals(str3));//for chack value equals or not

        String name = "Purna";
        String name2 = name.toUpperCase();
        System.out.println(name2 == name);
        System.out.println(name2.equals(name));
        System.out.println(name);
        System.out.println(name2);

        String text  = "Hello World";
        //check length og text
        System.out.println(text.length());//11
        //find character
        System.out.println(text.charAt(0));//H

        //substring
        System.out.println(text.substring(0,5));//Hello

        //contains , startswith ,endswith
        System.out.println(text.contains("Hello"));

        //replace

        System.out.println(text.replace("Hello", "My"));//change the hello with My and print it
    }
}

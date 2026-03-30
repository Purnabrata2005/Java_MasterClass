package java_basics.data_types;

public class three_loops {
    public static void main(String[] args) {
        //while loop
        int a=5;
        while(a>0){
            System.out.println("Hello");
            a--;
        }
        System.out.println("...........................");
        //for loop
        for (int i=5;i>0;i--){
            System.out.println("Hello");
        }
        System.out.println("...........................");
        //do while loop
        int b=5;
        do {
            System.out.println("Hello");
            b--;
        }while(b>0);
    }
}

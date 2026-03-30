package java_basics.data_types;

public class four_array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr[0]);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("................");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("...............");
        //other technique of array

        int arr1[] = {1, 2, 3, 4, 5};
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}

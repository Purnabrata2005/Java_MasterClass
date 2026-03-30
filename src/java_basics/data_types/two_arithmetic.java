package java_basics.data_types;

public class two_arithmetic {
    public static void main(String[] args) {
        //arithmetic operator

        int a = 5 + 6;
        int b = 5 - 6;
        int c = 4 * 8;
        int d = 10 / 3;//output is 3 (integer output)
        double e = 10 / 3;//output is 3.333(float output)
        int f = 10 % 3;

        //bitwise operator

        //logical operator

        //switch case

        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Unknown";
                break;
        }

        System.out.println(dayName);

        //ternary operator

        //result = (condition) ? valueIfTrue:valueIfFlash

        int p=5;
        boolean isTrue=p%2==0 ?true:false;
        System.out.println(isTrue);


    }
}

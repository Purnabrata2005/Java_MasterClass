package Map;

import java.util.ArrayList;
import java.util.List;

public class comparableDemo {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();

        list.add(new Students("Purna",4));
        list.add(new Students("Rahul",1));
        list.add(new Students("Debo",3));

        list.sort(null);

        System.out.println(list);
    }
}

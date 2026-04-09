package Map;

import java.util.HashMap;
import java.util.Objects;

public class hashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Students, String> map = new HashMap<>();
        Students s1 = new Students("Purna", 5);
        Students s2 = new Students("Rahul", 8);
        Students s3 = new Students("Purna", 5);

        map.put(s1, "Engineer");
        map.put(s2, "Designer");
        map.put(s3, "Manager");

        System.out.println("HashMap size:" + map.size());
        System.out.println("Value for p1:" + map.get(s1));
        System.out.println("Value for p3:" + map.get(s3));
        System.out.println(s1);
    }
}

class Students implements Comparable<Students> {
    private String name;
    private int id;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Students other = (Students) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id:" + id + " name:" + name;
    }

    @Override
    public int compareTo(Students o) {
        return Double.compare( this.getId(),o.getId());
    }
}

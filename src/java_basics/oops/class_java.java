package java_basics.oops;

class Car1 {
    int speed;
    String color;

    void drive() {
        System.out.println("the " + color + " color car run at speed " + speed);
    }

}

public class class_java {
    public static void main(String[] args) {

        Car1 car = new Car1();
        car.color = "red";
        car.speed = 5;
        car.drive();

    }
}

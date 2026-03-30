package java_basics.oops;

//encapsulation the first piler

class Car {
    int speed;
    private String color;

    public Car(String color) {
        this.color = color;
    }


    void drive() {
        System.out.println("drive...... ");
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Car car = new Car("red");
        car.speed = 5;
        car.drive();
    }
}

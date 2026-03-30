package java_basics.oops;

//Runtime polymorphism
class Animal1 {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog Sound");
    }
}

class Cat1 extends Animal1 {
    void sound() {
        System.out.println("Cat Sound");
    }
}

//compile time polymorphism (method overloading)

class Calculator {
    //add two integer
    int add(int a, int b) {
        return a + b;
    }

    //add three integer
    int add(int a, int b, int c) {
        return a + b + c;
    }
}


public class polymorphism {
    public static void main(String[] args) {

//        //compile time polymorphism
//        Calculator calc = new Calculator();
//        System.out.println(calc.add(10, 20));
//        System.out.println(calc.add(10, 20, 40));

         //Runtime polymorphism
        Animal1 animal1 = new Dog1();//upcasting
        Animal1 animal2 = new Cat1();//upcasting
        animal1.sound();
        animal2.sound();

    }
}

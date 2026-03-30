package java_basics.oops;


// multilevel inheritance

class Animal {
    void speak() {
        System.out.println("I am an animal");
    }

    void eat() {
        System.out.println("i am eating only non-veg");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("I am a dog");
    }
}

class Puppy extends Dog {
    void bark() {
        System.out.println("I am a dog puppy ");
    }
}

//java not support multilevel inheritance
//it has solution by using interfaces


public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Puppy puppy = new Puppy();
        puppy.bark();
        puppy.eat();
    }
}

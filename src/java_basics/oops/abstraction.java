package java_basics.oops;

abstract class Person {
    abstract void sayHello();

    void sleep() {
        System.out.println("Zzz...");
    }
}

class Man extends Person {
    @Override
    void sayHello() {
        System.out.println("I am a man");
    }
}

class Woman extends Person {
    @Override
    void sayHello() {
        System.out.println("I am a woman");
    }
}

interface Mobile {
    int battery = 1;

    void mackCall();
}

interface PlayMusic {
    void playMusic();
}

class SmatrPhone implements Mobile, PlayMusic {

    @Override
    public void mackCall() {
        System.out.println("making a call");
    }

    @Override
    public void playMusic() {
        System.out.println("playing a music");
    }


}


public class abstraction {
    public static void main(String[] args) {
//        Man man = new Man();
//        Woman woman = new Woman();
//        man.sayHello();
//        woman.sayHello();
//        man.sleep();

        SmatrPhone smatrPhone = new SmatrPhone();
        smatrPhone.mackCall();
        smatrPhone.playMusic();
        System.out.println(smatrPhone.battery);
    }
}
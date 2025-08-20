abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch");
    }
}

public class abstract3 {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.sound(); 
        myDog.sleep();  

        myDog.play();  
    }
}

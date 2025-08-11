// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method (with implementation)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Interface
interface Pet {
    void play();
}

// Class Dog extending abstract class and implementing interface
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

// Main class to run the program
public class abstract3 {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Using abstract class method
        myDog.sound();  // Output: Dog barks
        myDog.sleep();  // Output: Sleeping...

        // Using interface method
        myDog.play();   // Output: Dog plays fetch
    }
}

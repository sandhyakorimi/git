interface Animal {
    void eat();
}

interface Pet {
    void play();
}

// DogBehavior extends two interfaces
interface DogBehavior extends Animal, Pet {
    void bark();
}

// Class implements the combined interface
class Dog implements DogBehavior {
    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch");
    }

    @Override
    public void bark() {
        System.out.println("Dog barks loudly");
    }
}

public class InterfacTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
        d.bark();
    }
}

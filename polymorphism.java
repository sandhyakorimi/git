
// Compile-time polymorphism example (Method Overloading)
class Calculator {
    // Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adds two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

// Runtime polymorphism example (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism
        Calculator calc = new Calculator();
        System.out.println("Add 2 numbers: " + calc.add(5, 10));
        System.out.println("Add 3 numbers: " + calc.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + calc.add(5.5, 3.2));

        // Runtime polymorphism
        Animal a;
        a = new Dog();
        a.sound();  // Calls Dog's sound()

        a = new Cat();
        a.sound();  // Calls Cat's sound()
    }
}

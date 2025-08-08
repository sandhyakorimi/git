class Animal {
    // Animal class with no methods
}

class Dog extends Animal {
    // Dog class inherits from Animal
}

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); // Creating a Dog object

        System.out.println(d instanceof Dog);    // true
        System.out.println(d instanceof Animal); // true (Dog is a subclass of Animal)
    }
}





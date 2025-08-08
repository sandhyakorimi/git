
    class Animal {}

class Dog extends Animal {}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(d instanceof Dog);    // true
        System.out.println(d instanceof Animal); // true (because Dog extends Animal)
    }
}



// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class polymorphism {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println("Add 2 numbers: " + calc.add(5, 10));
//         System.out.println("Add 3 numbers: " + calc.add(5, 10, 15));
//         System.out.println("Add 2 doubles: " + calc.add(5.5, 3.2));

//         Animal a;
//         a = new Dog();
//         a.sound(); 

//         a = new Cat();
//         a.sound();  
//     }
// }


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal a; 

        a = new Dog();  
        a.sound();

        a = new Cat();  
        a.sound();   
    }
}






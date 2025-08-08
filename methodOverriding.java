
    class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog barks"); } // Same name, same signature
}
public class methodOverriding{
    public static void main(String [] args){
        Animal d1 = new Dog();
        d1.sound();
    }
}

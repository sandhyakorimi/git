public class abstract2 {
    public static void main(String[] args) {
        animal myDog = new dog();
        myDog.sound();
        myDog.eat();
    }
}
abstract class animal{
    abstract void sound();
    void eat(){
        System.out.println("Every animal eats");
    }
}
class dog extends animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}

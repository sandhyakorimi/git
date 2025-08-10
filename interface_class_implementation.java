public class interface_class_implementation {
    public static void main(String [] args){
        c obj1 = new c();
        obj1.sound();
        obj1.eat();
    }
}
interface A{
    void sound();
}
interface B extends A{
     void eat();
}
class c implements B{
    public void sound(){
        System.out.println("Barking");
    }
    public void eat(){
        System.out.println("Eating");
    }
}


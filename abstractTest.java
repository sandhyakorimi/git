abstract class A{
   abstract void A();
}
class B extends A{
    public void A(){
        System.out.println("my abstract class");
    }
}
public class abstractTest{
    public static void main(String [] args){
        A obj = new B();
        obj.A();
    }
}
abstract class A{
   abstract void Ab();
}
class B extends A{
    public void Ab(){
        System.out.println("my abstract class");
    }
}
public class abstractTest{
    public static void main(String [] args){
        A obj = new B();
        obj.Ab();
    }
}
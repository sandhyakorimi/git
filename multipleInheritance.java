public class multipleInheritance{
    public static void main(String [] args){
        c obj = new c();
        obj.display();
    }
}
interface A {
    void display();
}

interface B {
    void display();
}
class c implements A, B {
    @Override
    public void display() {
        System.out.println("Resolved method from both A and B");
    }
}
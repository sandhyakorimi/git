
interface A {
    void display();
}

interface B {
    void display();
}

class MyClass implements A, B {
    @Override
    public void display() {
        System.out.println("Single implementation for both A and B");
    }
}

public class TwoInterfaces {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();  // ✅ Works fine
    }
}

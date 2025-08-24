class Student {
    private String name;
    private int age;

    // getter methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age > 0) {   // validation
            this.age = age;
        }
    }
}

public class encapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sandhya");
        s.setAge(22);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

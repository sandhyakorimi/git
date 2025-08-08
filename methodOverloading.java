public class methodOverloading {
    public static void main(String args[]){
    Maths obj1 = new Maths();
   int c= obj1.add(2,4);
   double d = obj1.add(5.6,5.9);
   System.out.println(c);
   System.out.println(d);
    }
}
 class Maths{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}
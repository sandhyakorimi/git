import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a,b,c with one space gap:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b*b-(4*a*c);
        if(d>0){            //roots are real and distinct
            double root1 = (-b + Math.sqrt(d))/(2*a);
            double root2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("Root1: "+root1);
            System.out.println("Root2: "+root2);
        } 
        else if(d==0){
            System.out.println("Roots are Real and Same");
            double roots = (-b/(2*a));
            System.out.println("They are:"+roots+"and"+roots);
        }
        else{       //roots are imaginary
            double realPart = -b/(2*a);
            double imaginaryPart = Math.sqrt(-d)/(2*a);
            System.out.println("imaginary roots");
            System.out.println("Root1 is : "+realPart+"+"+imaginaryPart+"i");
            System.out.println("Root2 is :"+realPart+"-"+imaginaryPart+"i");
        }
        sc.close();
    }
}

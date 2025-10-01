// import java.util.Scanner;
// public class Fibonacci_using_recursion{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Number to find the value in fibonacci series : ");
//         int n = sc.nextInt();
//         int a = 0; 
//         int b = 1; 
//         int c = 0;
//         for(int i=2; i<=n; i++){
//             c = a+b;
//             a = b;
//             b = c;
//         }
//         System.out.println("The "+n+"th fibonocci number is : "+a);
//     }
// }



import java.util.Scanner;


public class Fibonacci_using_recursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find fibonacci value : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series is : ");
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1) {
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
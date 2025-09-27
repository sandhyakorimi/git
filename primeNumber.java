// import java.util.Scanner;
// public class primeNumber{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(num==0||num==1){
//             System.out.println("are not prime ");
//         }
//         for(int i=2; i<=Math.sqrt(num); i++){
//             if(num%i==0){
//                 System.out.println(num+" : is not Prime");
//                 break;
//             }
//             else{
//                 System.out.println((num+" : is Prime"));
//             }
//         }
//     }
// }





import java.util.Scanner;
public class primeNumber{
    public static void main(String args[]){
        System.out.println(" Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num<=1){
            isPrime = false;
        }
        else{
            for(int i=2; i<= Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " : is prime.");
        }
        else System.out.println(num+ " : is not prime.");
        sc.close();
    }
}
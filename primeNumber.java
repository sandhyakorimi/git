import java.util.Scanner;
public class primeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0||num==1){
            System.out.println("are not prime ");
        }
        for(int i=2; i<num/2; i++){
            if(num%i==0){
                System.out.println(num+" : is not Prime");
                break;
            }
            else{
                System.out.println((num+" : is Prime"));
            }
        }
    }
}
import java.util.Scanner;
public class Sum_of_elements_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+"elements to array :");
        int sum = 0;
        for(int i = 0 ; i<=n-1; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of numbers in a array is : "+sum);
        sc.close();
    }
}
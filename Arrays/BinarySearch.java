package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of numbers in arrays : ");
        int n = sc. nextInt();
        
        System.out.print("Enter "+n+" numbers (in unsorted ) : ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("Enter element to be search : ");
        int search = sc.nextInt();

        int low=0,high=n-1;
        boolean found = false;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==search){
                System.out.print("element found at index (in sorted) : "+mid);
                found = true;
                break;
            }
            else if(arr[mid]<search){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        if(!found){
            System.out.print("Element not found . ");
        }

        sc.close();
    }
   
}

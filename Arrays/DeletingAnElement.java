package Arrays;

import java.util.Scanner;

public class DeletingAnElement {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc. nextInt();
        System.out.print("Enter the array elements : ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        
        int newArray[] = new int[n-1];
        System.out.print("Array after deleting last element is : ");
        for(int i=0; i<n-1; i++){
            newArray[i] = arr[i];
        }

        for(int num:newArray){
            System.out.print(num+" ");
        }
        sc.close();
    }
   
}

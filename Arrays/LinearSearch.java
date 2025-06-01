package Arrays;

import java.util.Scanner;

public class LinearSearch {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc. nextInt();

        System.out.print("Enter Elements into array : ");
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Element to be Searched : ");
        int search = sc.nextInt();
        
        boolean found = false;
        for(int i=0; i<n; i++){
            if(arr[i]==search){
                System.out.print("Element "+search+" is found at index "+i+" in a array");
                found = true;
                break;
            }
        }

        if(!found){
                System.out.print("Element "+search+" is not found in a array");
        }


        sc.close();
    }
   
}

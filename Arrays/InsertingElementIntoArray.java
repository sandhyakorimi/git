package Arrays;

import java.util.Scanner;

public class InsertingElementIntoArray {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements to array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter new element to be inserted : ");
        int newElement = sc.nextInt();

        int newArr[] = new int[n+1];
        for(int i=0; i<n; i++){
            newArr[i] = arr[i];
        }
        newArr[n] = newElement;

        System.out.print("New  array after inserting  "+newElement+" : ");
        for(int num:newArr){
            System.out.print(num+" ");
        }
        sc.close();
    }

}

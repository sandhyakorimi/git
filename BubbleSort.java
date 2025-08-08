// import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
       int arr[] = {1, 5, 6, 4, 2, 8, 0};

       int temp=0;
        System.out.println("before sorting");
       for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");     
       }
       System.out.println();

       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
           }
       }
       System.out.println("After Sorting");
        for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");   
       }
    }
}

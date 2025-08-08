public class SelectionSort {
    // import java.util.Scanner;

    public static void main(String[] args){
       int arr[] = {1, 5, 6, 4, 2, 8, 0};
       int temp=0;
       int minIndex=-1;

       System.out.println("before sorting");
       for(int num:arr){
                System.out.print(num+" "); 
       }
       System.out.println();

       for(int i=0;i<arr.length-1;i++){
        minIndex=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[minIndex]>arr[j])
            minIndex=j;
        }
        temp = arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;

            System.out.println();
          for(int num:arr){
                System.out.print(num+" ");  
        }
        
       }

       System.out.println();

       System.out.println("After Sorting");
        for(int num:arr){
                System.out.print(num+" ");
           
        }
    }


}

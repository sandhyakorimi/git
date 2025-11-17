import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the First String : ");
        String str1= sc.nextLine().toLowerCase().replaceAll("\\s","" );
        System.out.println(" Enter the Second String : ");
        String str2 =sc.nextLine().toLowerCase().replaceAll("\\s", "");
        if(str1.length()!=str2.length()){
            System.out.println(" Not Anagram ");
        }
        else{
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println(" It is an Anagram! ");
            }
            else{
                System.out.println(" It is not an Anagram! ");
            }   
        }    
        sc.close();      
    }   

}              

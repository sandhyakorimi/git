
package level1;
import java.util.Scanner;
public class ConsonantOrVowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().toLowerCase().charAt(0);
        if(!Character.isLetter(ch)){
            System.out.println("Not a character");
        }
        else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("the character "+ch+" is vowel");
        }
        else{
            System.out.println("the character "+ch+ " is Consonant");
        }
        sc.close();
    }
}

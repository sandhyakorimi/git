import java.util.Scanner;
public class No_of_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine().toUpperCase();
        int n = str.length();
        String vowels = " ";
        int num =  0;
        for(int i=0 ; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                num += 1;
                vowels += ch+" ";
            } 
        }
        System.out.println("The String "+str+" contains "+num+ " vowels. "+ "Those are : "+vowels);
        sc.close();
    }
}

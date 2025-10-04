import java.util.Scanner;
public class Reverse_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = sc.nextLine();
        System.out.println();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word: words){
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse().toString()).append(" ");
        }
        System.out.println("Reverse words : "+result.toString().trim()); // combine the words
        sc.close();
    }
}

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 100;  // you can change this value
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
}

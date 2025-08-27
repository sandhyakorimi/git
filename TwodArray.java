public class TwodArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        System.out.println("2D Array Elements:");
        for (int i = 0; i < numbers.length; i++) {           // rows
            for (int j = 0; j < numbers[i].length; j++) {   // columns
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}

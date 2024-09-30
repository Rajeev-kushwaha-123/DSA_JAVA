import java.util.*;

public class GreatestNumber {
    // Function to find the greatest number
    public static int greatestNumber(int[] numbers) {
        int max = numbers[0];  // Assume first number is the greatest initially
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // Update max if current number is greater
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many numbers user wants to input
        System.out.print("How many numbers do you want to input: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];  // Array to store the input numbers

        // Get the numbers from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Call the greatestNumber function to find the greatest number
        int greatestNo = greatestNumber(numbers);

        // Output the greatest number
        System.out.println("The greatest number is: " + greatestNo);

        sc.close();  // Close the scanner
    }
}

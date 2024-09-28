import java.util.Scanner;

public class addTwoNoFunction {
    // Function to add two numbers
    public static int addTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first number
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        // Input for the second number
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Call the function and display the result
        int result = addTwoNumber(a, b);
        System.out.println("The sum of the two numbers is: " + result);

        sc.close();
    }
}


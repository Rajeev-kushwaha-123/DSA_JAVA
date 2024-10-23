// PS C:\Users\rajee\OneDrive\Desktop\project\java> java apowerb.java          
// Enter the number a:
// 4
// Enter the number b:
// 4
// Result of 4^4 is: 256
// PS C:\Users\rajee\OneDrive\Desktop\project\java> 



import java.util.*;
public class apowerb {
    public static int power(int a, int b) {
        int sum = 1; // Initialize sum as 1
        while (b > 0) { // Use > 0 to ensure we multiply for positive powers
            sum *= a; // Multiply sum by a
            b--; // Decrease b
        }
        return sum; // Return the final result after the loop
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b = sc.nextInt();
        System.out.println("Result of " + a + "^" + b + " is: " + power(a, b)); // Display the result
        sc.close(); // Close the scanner
    }
}

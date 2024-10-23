//greatest common factor
// PS C:\Users\rajee\OneDrive\Desktop\project\java> java GCD.java
// Enter the number a:
// 3
// Enter the number b:
// 11
// GCD: 1
// PS C:\Users\rajee\OneDrive\Desktop\project\java> java GCD.java
// Enter the number a:
// 2
// Enter the number b:
// 9
// GCD: 1
// PS C:\Users\rajee\OneDrive\Desktop\project\java> java GCD.java
// Enter the number a:
// 2 
// Enter the number b:
// 8
// GCD: 2

import java.util.*;

public class GCD {
    public static int printgcd(int a, int b) {
        while (b != 0) { // Check if b is not zero
            int r = a % b; // Calculate remainder
            a = b; // Update a to b
            b = r; // Update b to remainder
        }
        return a; // a is now the GCD
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b = sc.nextInt();
        System.out.println("GCD: " + printgcd(a, b)); // Display the result
        sc.close(); // Close the scanner
    }
}

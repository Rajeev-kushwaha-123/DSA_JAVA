// PS C:\Users\rajee\OneDrive\Desktop\project\java> java pos_neg_count.java
// Write a number (-ve, +ve, or zero):
// 12
// Enter 1 to continue or 2 to exit:
// 1
// Write a number (-ve, +ve, or zero):
// 23
// Enter 1 to continue or 2 to exit:
// -23
// Write a valid number by entering 1 or 2.
// Write a number (-ve, +ve, or zero):
// 2
// Enter 1 to continue or 2 to exit:
// 2
// No. of count of negative numbers: 0
// No. of count of positive numbers: 3
// No. of count of zeros: 0
// PS C:\Users\rajee\OneDrive\Desktop\project\java>


import java.util.*;

class pos_neg_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNumberPositive = 0;
        int countNumberNegative = 0;
        int countNumberZero = 0;

        while (true) {
            System.out.println("Write a number (-ve, +ve, or zero):");
            int a = sc.nextInt();

            if (a < 0) {
                countNumberNegative++;
            } else if (a == 0) {
                countNumberZero++;
            } else {
                countNumberPositive++;
            }

            System.out.println("Enter 1 to continue or 2 to exit:");
            int d = sc.nextInt();

            if (d == 2) {
                break;  // Exit the loop
            } else if (d != 1) {
                System.out.println("Write a valid number by entering 1 or 2.");
            }
        }

        // Output the counts after exiting the loop
        System.out.println("No. of count of negative numbers: " + countNumberNegative);
        System.out.println("No. of count of positive numbers: " + countNumberPositive);
        System.out.println("No. of count of zeros: " + countNumberZero);
        
        // Close the scanner
        sc.close();
    }
}

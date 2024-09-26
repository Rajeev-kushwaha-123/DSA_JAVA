import java.util.Scanner;

public class addTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number:");

        int a=sc.nextInt(); //storing the input inside the variable by using the nextInt

        System.out.println("enter the second number:");

        int b=sc.nextInt(); //storing the input inside the variable by using the nextInt

        int sum=a+b;

        System.out.println("The sum of two number is :" +sum);

        sc.close();
    }
}

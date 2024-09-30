import java.util.*;

public class average3Number {
    public static float average(int a,int b,int c){
        return (a + b + c) / 3.0f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a=sc.nextInt();
        System.out.print("enter the second number: ");
        int b=sc.nextInt();
        System.out.print("enter the third number: ");
        int c=sc.nextInt();
        float average=average(a, b,c);
        System.out.print("Average number is "+ average);
        sc.close();


    }
}

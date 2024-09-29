import java.util.*;
public class factorial{
    public static int factorialPrint(int number){
       if (number==1){
          return 1;
       }    
       else{
            return number*factorialPrint(number-1);
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int number=sc.nextInt();
        int fact=factorialPrint(number);
        System.out.print("factorial is: "+ fact);
        sc.close();
    }
}
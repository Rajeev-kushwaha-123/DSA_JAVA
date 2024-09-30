import java.util.*;
public class oddNumberFunction{
    public static int sumOddPrint(int n){
        int i;
        int sum=0;
        for( i=1;i<=n;i++){
            if (i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n =sc.nextInt();
        int sum=sumOddPrint(n);
        System.out.println("sum of odd number is "+sum);
        sc.close();
        
        }
    }

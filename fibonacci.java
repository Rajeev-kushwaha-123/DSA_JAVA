// PS C:\Users\rajee\OneDrive\Desktop\project\java> java fibonacci.java
// enter the number:
// 12
// 0 1 1 2 3 5 8 13 21 34 55 89 
// PS C:\Users\rajee\OneDrive\Desktop\project\java> 

import java.util.*;
public class fibonacci {
    public static void printfib(int n){
        int a=0;
        int b=1;
        int count=0;
        while(count < n){
            System.out.print(a + " ");
            int c=a+b;
            a=b;
            b=c;
            count++;
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number:");
       int n=sc.nextInt();
       printfib(n);
       sc.close();
    }
}

import java.util.*;
public class table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int product;
        for(int i=1;i<=10;i++){
              product=n*i;
              System.out.println("tabel is :"+product);
        } 
        sc.close();
    }
   
}

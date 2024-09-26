import java.util.*;
public class conditionalStatement2 {
    public static void main(String[] args) {
    /*syntax of switch condition
        switch(condition){
        case 1:.......;
        case2: .......;
         default:......;
    }*/
 
    /*write a code to print the greeting: if the value is press 1 then return the hello,
    if the value is press 2 then return the namaste and  if the value is press 3 then return the bonjour */
     
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the greeting button 1/2/3:");
    int button=sc.nextInt();
    
    switch (button) {
        case 1: System.out.println("Hello");
                break;
        case 2:System.out.println( "namaste");
            break;
        case 3:System.out.println("bonjour");
            break;
        default:System.out.println("Invalid button");
            break;
    }
    sc.close();
    }
}

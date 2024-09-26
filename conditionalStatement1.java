import java.util.*;
public class conditionalStatement1{
    public static void main(String[] args) {
    /*
    1. basic syntax
        if (condition){

        }
        else{

        }

       2. syntax
       if (condition){

       }
       else if {

       }
       else{

       } 
    */
    //write a code to find out the even and odd number.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to want tocheck the even or odd number:");
    int number=sc.nextInt();

    if (number % 2 == 0) {
        System.out.println("The number " + number + " is Even.");
    } else {
        System.out.println("The number " + number + " is Odd.");
    } 

    sc.close();

}
    }  
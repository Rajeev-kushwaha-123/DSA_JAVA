/*
function defined as a block of code which perform some operation by taking input and generate
suitable output.

syntax:
  1.   return type functionName(type1,type2,....,type n){
  2.    //operation
  3.                      }

question 1. print a given name in a function 

*/
import java.util.*;
public class function{
  public static void printMyName(String name){
    System.out.println(name);
    return ;
  }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name: ");
        String name=sc.nextLine();
        printMyName(name);
        sc.close();
    }
}
/*
enter the name:rajeev kushwaha
rajeev kushwaha
 */





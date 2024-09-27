/*
     *****
    *****
   *****
  *****
 *****


 */

public class solidRhombusPattern {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
             int spaces=n-i;
             for (j=0;j<=spaces;j++){
                 System.out.print(" ");
             }
             for (j=0;j<=4;j++){
                System.out.print("*");
             }
            }
            System.out.println();
        }
    }
}

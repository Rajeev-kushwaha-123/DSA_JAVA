/*

12345 
1234 
123 
12 
1 

 */

public class pattern8 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            int sum=1;
            for (int j=0;j<5;j++){
                if (i<=j){
                    System.out.print(sum);
                    sum++;
                }
            }
        System.out.println(" ");
        }
    }
}
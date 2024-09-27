/*
1      
1 2     
1 2 3    
1 2 3 4   
1 2 3 4 5
 */

public class floydTrianglePattern{
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            int sum =1;
            for (int j=0;j<5;j++){
                if (i>=j){
                  System.out.print(sum);
                  sum++;
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }   
}
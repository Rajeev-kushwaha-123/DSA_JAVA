/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

 */

public class numberPyramidPattern {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            int count=1;
            for (int j=1;j<=9;j++){
                int sum =i+j;
                if (sum%2==0 && sum>=6 ){
                    if (count<=i){
                        System.out.print(count);
                    }
                    count++;
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println(" ");
        } 
    }
}

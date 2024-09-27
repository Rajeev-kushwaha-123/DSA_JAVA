/*
1 
01 
101 
0101 
10101 
 */

public class triangle_0_1Pattern {
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                int  sum = i+j;
                if (i>=j){
                    if(sum%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                   
                }
            }
            System.out.println(" ");
        }
    }
}


/*

1
12
123
1234
12345

 */

public class pattern7{
    public static void main(String[] args){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i>j){
                    System.out.print(j);
                }
            }
        System.out.println(" ");
        }
    }
}
 /*
         initilisation;
         while(condition){
            //do something 
         }
*/
public class whileLoop {
    public static void main(String[] args){
    While();
    System.out.println("..............................");
    Dowhile();
    }

    public static void While(){
        int i=0;
        while(i<5){
            System.out.println("Hello world!");
            i++;
        }
    }
    public static void Dowhile(){
        int i=0;
        do{
            System.out.println("hello world!");
            i++;
        }while(i<5);
    }
    
}

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("ENTER THE NUMBER : ");
     int a = input.nextInt();

     if(a%2==0){
        System.out.println("This is even number");
     }
     else{
        System.out.println("this is odd number");
     }

    }
    
}

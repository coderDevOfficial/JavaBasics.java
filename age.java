import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER AGE : ");
        int a = input.nextInt();
        if(a>=18){
            System.out.println("adult ");
        }else if( a>=13 && a<=18){
          System.out.println("teenager ");  
        }
        else{
            System.out.println("child ");
        }

    }
    
}

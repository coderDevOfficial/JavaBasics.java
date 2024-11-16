import java.util.*;
public class tax {
    public static void main(String[] args) {
         Scanner input  = new Scanner(System.in);
         System.out.println("enter your income : "); 
         int a= input.nextInt();
        if(a<=500000){
            System.out.println("your tax is: 0  ");
        }
        else if (a>500000 && a<=1000000){
          double totalTAX= a * 0.2;
            System.out.println("Your tax is " + totalTAX);
        }
        else{
            double totalTAX = a * 0.3;
            System.out.println("your tax is " + totalTAX);
        }
    }
    
}

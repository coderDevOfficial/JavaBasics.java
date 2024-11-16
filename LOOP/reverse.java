package LOOP;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
    Scanner input =new Scanner (System.in);
    System.out.println("Enter a number : ");
    int number = input.nextInt();
  
   
     
        // Loop to extract and print each last digit
        for (int i = number; i > 0; i /= 10) {
            // Get the last digit
            int lastDigit = i % 10;
            // Print the last digit
             System.out.print(lastDigit);
        }
        
    }
}


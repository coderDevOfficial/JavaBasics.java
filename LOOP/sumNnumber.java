package LOOP;
import java.util.*;
public class sumNnumber {
public static void main(String[] args) {
   Scanner input =new Scanner(System.in);
   System.out.println("Enter digit: ");
    int N = input.nextInt();
   int i = 0;
   int sum = 0;
    while (  i<=N ) {
       sum= sum+i;
       i++; 
       
    }
     System.out.println("the sum is "+ sum);

}
    
}

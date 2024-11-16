package LOOP;
import java.util.*;
public class REVERSE1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = input.nextInt();
    int rev = 0;
    for(int i= n;i>0;i/=10){
        int LD= i%10;
        rev= (rev*10)+LD;
         
    }
    System.out.println(rev);
  }  
}

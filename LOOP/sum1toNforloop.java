package LOOP;
import java.util.*;              
public class sum1toNforloop {
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("enter number: ");
    int sum =0;
    int n =input.nextInt();
    for(int i=1;i<=n;i++){
           sum = sum + i;
    }
    System.out.println("the sum of "+ n +"numbers : " + sum );
}
    
}

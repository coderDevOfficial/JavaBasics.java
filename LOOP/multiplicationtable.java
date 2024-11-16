package LOOP;
import java.util.*;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number for multiplication table : ");
        int n = input.nextInt();
        int mul=1;
        System.out.println("multiplication table of "+ n +" " +"number");
        for(int i= 1;i<=10;i++){
            mul=n*i;
            System.out.println(n +"X"+i+ "="+ mul);
        }
    }
    
}

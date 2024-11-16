import java.util.*;
public class largest {
public static void main(String[] args) {
  
    try(  Scanner input = new Scanner(System.in);){

      System.out.println("Enter 1st number:  ");
      int a = input.nextInt();
      System.out.println("Enter 2nd number:  ");
      int b = input.nextInt();
     if(a<b){
     System.out.println(b + " - "+"largest number");
     }
     else if(a==b){
       System.out.println(" two values are equal");
     }
     else{
      System.out.println(a+ " - " +"largest number");
     }
     input.close();
    }
}
    
}

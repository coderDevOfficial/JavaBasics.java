import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER 1ST NUMBER: ");
        double x =input.nextDouble();
         System.out.println("ENTER 2nd NUMBER: ");
        double y =input.nextDouble();
         System.out.println("ENTER 3rd NUMBER: ");
        double z =input.nextDouble();
        double AVG = (x+y+z)/3;
        System.out.println("the average of 3 numbers : " + AVG);
    }
}

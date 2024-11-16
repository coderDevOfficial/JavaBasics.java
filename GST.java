import java.util.*;
public class GST {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER value of pen: ");
        float a = input.nextFloat();
         System.out.println("ENTER value of pencil: ");
        float b = input.nextFloat();
         System.out.println("ENTER value of eraser : ");
        float c = input.nextFloat();
       System.out.print("Enter GST percentage (you can include '%' symbol): ");
        String gst = input.next();
        
        // Remove the '%' symbol if it exists and convert the string to a float
        if (gst.contains("%")) {
            gst = gst.replace("%", "");  // Remove the '%' character
        }
          float gstPercentage = Float.parseFloat(gst);
        float sum= a+b+c;
     float gstAmount = (sum * gstPercentage) / 100;
      double total = gstAmount+sum;

       System.out.println("total value with GST : " + total);
    }
}

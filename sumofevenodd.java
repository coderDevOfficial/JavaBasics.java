import java.util.*;
public class sumofevenodd {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        int sumEven= 0;
        int sumOdd=0;
        System.out.println("Enter"+" "+  n + " " +"numbers: ");
        for(int i=1;i<=n;i++){
            int M=input.nextInt();
            if(M%2==0){
            sumEven=sumEven+M;
            }
            else{
                sumOdd= sumOdd+M;
            }
        }
        System.out.println("The Sum even number -> " + sumEven );
         System.out.println("The Sum even number -> " + sumOdd );
    }
    
}

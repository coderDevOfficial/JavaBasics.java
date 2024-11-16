package LOOP;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
       int n = input.nextInt();
        boolean prime = true;
        if(n<=1){
            prime = false;
        }
            else{
                for( int i=2;i<=n-1;i++){
                    if(n%i==0){
                        prime = false;
                        
                    }
                }

            }
            if(prime){
                System.out.println(n +":" + " is prime");
            }
            else{
                System.out.println(n + ":"+ " is not prime");
            }
        }
    } 


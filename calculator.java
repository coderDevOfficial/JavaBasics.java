
    
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.print("Enter the first number: ");
        result = scanner.nextDouble();

        while (true) {
            System.out.print("Enter an operator (+, -, , /) or 'q' to quit: ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q') {
                System.out.println("Final result: " + result);
                break;
            }

            System.out.print("Enter the next number: ");
            double number = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result += number;
                    break;
                case '-':
                    result -= number;
                    break;
                case '*':
                    result *= number;
                    break;
                case '/':
                    if (number != 0) {
                        result /= number;
                    } else {
                        System.out.println("Error: Division by zero is undefined.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Try again.");
                    continue;
            }

            System.out.println("Current result: " + result);
        }

        scanner.close();
    }
}

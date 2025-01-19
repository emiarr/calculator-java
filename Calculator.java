import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

             System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

          int operation = scanner.nextInt();

              System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

                double result = 0;

              switch (operation) {
            case 1: 
                result = num1 + num2;
                break;
            case 2: 
                result = num1 - num2;
                break;
            case 3: 
                result = num1 * num2;
                break;
            case 4: 
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return; 
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("The result is: " + result);
    }
}

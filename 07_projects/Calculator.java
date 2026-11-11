import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, result;
        char op;

        System.out.print("Enter first number: ");
        a = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = input.next().charAt(0);
        System.out.print("Enter second number: ");
        b = input.nextDouble();

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
    }
}

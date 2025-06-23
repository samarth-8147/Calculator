import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Cannot divide by zero.");
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Java Console Calculator!");

        while (running) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                running = false;
                System.out.println("Thanks for using the calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

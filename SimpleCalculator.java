import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Division");
        System.out.println("5. Quotient");
        System.out.println("6. Remainder");
        System.out.println("7. Exponential");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sum: " + (a + b));
                break;
            case 2:
                System.out.println("Difference: " + (a - b));
                break;
            case 3:
                System.out.println("Product: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                System.out.println("Quotient: " + ((int) a / (int) b));
                break;
            case 6:
                System.out.println("Remainder: " + (a % b));
                break;
            case 7:
                System.out.println("Exponential: " + Math.pow(a, b));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
        scanner.close();
    }
}

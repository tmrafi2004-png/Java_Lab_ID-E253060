import java.util.Scanner;
public class SimpleCalculator {
    // Helper to print a number cleanly: if whole number, print without decimal part.
    private static String formatNumber(double x) {
        if (x == Math.floor(x) && !Double.isInfinite(x)) {
            return String.format("%d", (long) x);
        } else {
            return String.format("%.6f", x).replaceAll("0+$", "").replaceAll("\\.$", "");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input — first value is not a number.");
            scanner.close();
            return;
        }
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input — second value is not a number.");
            scanner.close();
            return;
        }
        double b = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String opToken = scanner.next().trim();
        if (opToken.isEmpty()) {
            System.out.println("No operator entered.");
            scanner.close();
            return;
        }
        char op = opToken.charAt(0);
        double result;
        switch (op) {
           case '+':
               result = a + b;
               System.out.printf("%s + %s = %s%n", formatNumber(a),       formatNumber(b),formatNumber(result));
                break;
            case '-':
                result = a - b;
                System.out.printf("%s - %s = %s%n", formatNumber(a), formatNumber(b), formatNumber(result));
                break;
            case '*':
                result = a * b;
                System.out.printf("%s * %s = %s%n", formatNumber(a), formatNumber(b), formatNumber(result));
                break;
            case '/':
                if (b == 0.0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = a / b;
                    System.out.printf("%s / %s = %s%n", formatNumber(a), formatNumber(b), formatNumber(result));
                }
                break;
            default:
                System.out.println("Invalid operator. Please use one of: +, -, *, /");
        }
        scanner.close();
    }
}

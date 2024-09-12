import java.util.Scanner;

public class factorial {

    // Method to calculate factorial using an iterative approach
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial using a recursive approach
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using iterative method
            long iterativeResult = factorialIterative(number);
            System.out.println("Factorial (iterative) of " + number + " is " + iterativeResult);
            
            // Calculate factorial using recursive method
            long recursiveResult = factorialRecursive(number);
            System.out.println("Factorial (recursive) of " + number + " is " + recursiveResult);
        }
        
        scanner.close();
    }
}

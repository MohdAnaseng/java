import java.util.Scanner; // Import the Scanner class

public class Addition {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt(); // Read the first integer

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt(); // Read the second integer

        // Perform addition
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner (good practice)
        scanner.close(); 
    }
}

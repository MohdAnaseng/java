import java.util.Scanner; // Import the Scanner class to read input

public class Subtraction {
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input (keyboard)
        Scanner input = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Perform the subtraction
        int difference = num1 - num2;

        // Display the result
        System.out.println("The difference is: " + difference);

        // Close the scanner to prevent memory leaks
        input.close();
    }
}


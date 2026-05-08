import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Step 2: Initialize the array and sum variable
        double[] numbers = new double[n];
        double sum = 0;

        // Step 3: Loop to take input for each element and calculate sum
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        // Step 4: Calculate the average
        double average = sum / n;

        // Step 5: Display the result
        System.out.println("The average is: " + average);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

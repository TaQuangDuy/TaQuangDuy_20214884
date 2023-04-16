import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's choice of input method
        System.out.println("Enter 'i' to enter the array, or 'c' to use a pre-defined array:");
        String choice = scanner.next();

        int[] arr;

        if (choice.equalsIgnoreCase("i")) {
            // Get the values for the array from the user
            System.out.print("Enter the number of elements in the array: ");
            int numElements = scanner.nextInt();

            arr = new int[numElements];

            System.out.println("Enter the values for the array:");
            for (int i = 0; i < numElements; i++) {
                arr[i] = scanner.nextInt();
            }
        } else if (choice.equalsIgnoreCase("c")) {
            // Define the array as a constant
            arr = new int[]{22, 1, 76, 1884, 8, 2, 0, 44, 6};

            // Print out the constant array
            System.out.println("Constant array:");
            printArray(arr);
        } else {
            // Invalid choice
            System.out.println("Invalid choice. Please enter 'i' or 'c'.");
            return;
        }

        // Sort the array
        Arrays.sort(arr);

        // Print out the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print out the sum
        System.out.println("Sum of array elements: " + sum);

        // Calculate the average value of the array elements
        double average = (double) sum / arr.length;

        // Print out the average value
        System.out.println("Average value of array elements: " + average);
    }

    // Helper method to print out an array
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

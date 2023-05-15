package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'i' to enter the array, or 'c' to use a pre-defined array:");
        String choice = scanner.next();
        int[] arr;
        if (choice.equalsIgnoreCase("i")) {
            System.out.print("Enter the number of elements in the array: ");
            int numElements = scanner.nextInt();
            arr = new int[numElements];
            System.out.println("Enter the values for the array:");
            for (int i = 0; i < numElements; i++) {
                arr[i] = scanner.nextInt();
            }
        } else if (choice.equalsIgnoreCase("c")) {
            arr = new int[]{22, 1, 76, 1884, 8, 2, 0, 44, 6};
            System.out.println("Constant array:");
            printArray(arr);
        } else {
            System.out.println("Invalid choice. Please enter 'i' or 'c'.");
            return;
        }
        Arrays.sort(arr);
        System.out.println("Sorted array is:");
        printArray(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements is: " + sum);
        double average = (double) sum / arr.length;
        System.out.println("Average value of array elements is: " + average);
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

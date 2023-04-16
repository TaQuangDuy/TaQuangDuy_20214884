import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's choice of input method
        System.out.println("Enter 'i' to enter the matrices, or 'c' to use pre-defined matrices:");
        String choice = scanner.next();

        int[][] matrix1;
        int[][] matrix2;

        if (choice.equalsIgnoreCase("i")) {
            // Get the dimensions of the matrices from the user
            System.out.print("Enter the number of rows in the matrices: ");
            int numRows = scanner.nextInt();

            System.out.print("Enter the number of columns in the matrices: ");
            int numCols = scanner.nextInt();

            // Create the two matrices
            matrix1 = new int[numRows][numCols];
            matrix2 = new int[numRows][numCols];

            // Get the values for matrix1 from the user
            System.out.println("Enter the values for matrix1:");
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            // Get the values for matrix2 from the user
            System.out.println("Enter the values for matrix2:");
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        } else if (choice.equalsIgnoreCase("c")) {
            // Define the matrices as constants
            matrix1 = new int[][]{{1, 3, 3}, {2, 5, 0}, {7, 3, 1}};
            matrix2 = new int[][]{{2, 1, 7}, {9, 0, 4}, {2, 2, 1}};

            // Print out the constant matrices
            System.out.println("Constant matrix1:");
            printMatrix(matrix1);

            System.out.println("Constant matrix2:");
            printMatrix(matrix2);
        } else {
            // Invalid choice
            System.out.println("Invalid choice. Please enter 'i' or 'c'.");
            return;
        }

        // Add the matrices together
        int numRows = matrix1.length;
        int numCols = matrix1[0].length;

        int[][] result = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print out the result
        System.out.println("The sum of the matrices is:");
        printMatrix(result);
    }

    // Helper method to print out a matrix
    private static void printMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


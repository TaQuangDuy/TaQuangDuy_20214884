import java.util.Scanner;

public class Triangle {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the height of the triangle: ");
      int n = sc.nextInt();
      sc.close();
      
      for (int i = 0; i < n; i++) {
         for (int j = n-i; j > 1; j--) {
            System.out.print(" ");
         }
         for (int j = 0; j <= 2*i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}



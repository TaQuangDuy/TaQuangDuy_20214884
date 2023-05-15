package hust.soict.dsai.lab01;
import java.util.Scanner;

public class SystemOfFirstDegreeEquation{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double a11, a12, b1, a21, a22, b2;

      System.out.print("Enter a11: ");
      a11 = input.nextDouble();

      System.out.print("Enter a12: ");
      a12 = input.nextDouble();

      System.out.print("Enter b1: ");
      b1 = input.nextDouble();

      System.out.print("Enter a21: ");
      a21 = input.nextDouble();

      System.out.print("Enter a22: ");
      a22 = input.nextDouble();

      System.out.print("Enter b2: ");
      b2 = input.nextDouble();

      double det = a11 * a22 - a21 * a12;
      if (det == 0) {
         System.out.println("The system has no solution");
      } else {
         double x1 = (b1 * a22 - b2 * a12) / det;
         double x2 = (a11 * b2 - a21 * b1) / det;

         System.out.println("The solution of the system is:");
         System.out.println("x1 = " + x1);
         System.out.println("x2 = " + x2);
      }
   }
}

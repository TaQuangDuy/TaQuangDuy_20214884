import java.util.Scanner;
public class TwoDoubleNumbers {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st number(num1): ");
		double num1 = input.nextDouble();
		
		System.out.print("Enter 2nd number(num2): ");
		double num2 = input.nextDouble();

		System.out.println("sum of num1 and num2: " +(num1 + num2));
		System.out.println("difference of num1 and num2: " +java.lang.Math.abs((num1 - num2)));
		System.out.println("product of num1 and num2: " +(num1 * num2));	
		System.out.println("quotient of num1 and num2: " +(num1 / num2));
		input.close();
		}
	}
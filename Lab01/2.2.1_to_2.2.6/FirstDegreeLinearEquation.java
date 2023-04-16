import java.util.Scanner;

public class FirstDegreeLinearEquation{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String StrNum1 = keyboard.next();
        String StrNum2 = keyboard.next();
        double a = Double.parseDouble(StrNum1);
        double b = Double.parseDouble(StrNum2);
        if (a == 0){
            System.out.println("This is not first degree linear equation");
        }
        else{
            System.out.printf("The solution for x is : %.2f" , -b/a);
        }
    }
}

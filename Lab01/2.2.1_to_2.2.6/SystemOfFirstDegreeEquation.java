import java.util.Scanner;
public class SystemOfFirstDegreeEquation {
    public SystemOfFirstDegreeEquation(){}
    public double Det(double a_11 , double a_12 , double a_21 , double a_22){
        return a_11 * a_22 - a_12 * a_21;
    }
    public static void main(String[] args){
    	SystemOfFirstDegreeEquation sol = new SystemOfFirstDegreeEquation();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter b1:");
        double b1 = Double.parseDouble(keyboard.next());
        System.out.println("Enter b2:");
        double b2 = Double.parseDouble(keyboard.next());
        System.out.println("Enter a_11");
        double a_11 = Double.parseDouble(keyboard.next());
        System.out.println("Enter a_12");
        double a_12 = Double.parseDouble(keyboard.next());
        System.out.println("Enter a_21");
        double a_21 = Double.parseDouble(keyboard.next());
        System.out.println("Enter a_22");
        double a_22 = Double.parseDouble(keyboard.next());
        double D = sol.Det(a_11, a_12, a_21, a_22);
        double D1 = sol.Det(b1, a_12, b2, a_22);
        double D2 = sol.Det(a_11, b1, a_21, b2);
        if (D != 0){
            System.out.printf("The solution is x1 = %.2f and x2 = %.2f" , D1/D , D2/D);

        }
        else{
            if (D1 == 0 && D2 == 0){
                System.out.println("Infinity solutions");
            }
            else {
                System.out.println("No solution");
            }
        }

    }
}
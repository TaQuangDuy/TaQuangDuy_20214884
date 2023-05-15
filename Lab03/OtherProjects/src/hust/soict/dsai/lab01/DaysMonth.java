package hust.soict.dsai.lab01;
import java.time.YearMonth;
import java.util.Scanner;

public class DaysMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String monthString;
        int year, month = 0;

        do {
            System.out.print("Enter a month (in full name, abbreviation, in 3 letters, or in number): ");
            monthString = input.next().toLowerCase();

            if (monthString.equals("january") || monthString.equals("jan.") || monthString.equals("jan") || monthString.equals("1")) {
                month = 1;
            } else if (monthString.equals("february") || monthString.equals("feb.") || monthString.equals("feb") || monthString.equals("2")) {
                month = 2;
            } else if (monthString.equals("march") || monthString.equals("mar.") || monthString.equals("mar") || monthString.equals("3")) {
                month = 3;
            } else if (monthString.equals("april") || monthString.equals("apr.") || monthString.equals("apr") || monthString.equals("4")) {
                month = 4;
            } else if (monthString.equals("may") || monthString.equals("5")) {
                month = 5;
            } else if (monthString.equals("june") || monthString.equals("jun") || monthString.equals("6")) {
                month = 6;
            } else if (monthString.equals("july") || monthString.equals("jul") || monthString.equals("7")) {
                month = 7;
            } else if (monthString.equals("august") || monthString.equals("aug.") || monthString.equals("aug") || monthString.equals("8")) {
                month = 8;
            } else if (monthString.equals("september") || monthString.equals("sept.") || monthString.equals("sep") || monthString.equals("9")) {
                month = 9;
            } else if (monthString.equals("october") || monthString.equals("oct.") || monthString.equals("oct") || monthString.equals("10")) {
                month = 10;
            } else if (monthString.equals("november") || monthString.equals("nov.") || monthString.equals("nov") || monthString.equals("11")) {
                month = 11;
            } else if (monthString.equals("december") || monthString.equals("dec.") || monthString.equals("dec") || monthString.equals("12")) {
                month = 12;
            } else {
                System.out.println("Invalid month entered. Please enter a valid month.");
            }
        } while (month == 0);

        do {
            System.out.print("Enter a year: ");
            year = input.nextInt();

            if (year < 0) {
                System.out.println("Invalid year entered. Please enter a valid year.");
            }
        } while (year < 0);

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        System.out.printf("The month of %s in year %d has %d days.", monthString.substring(0, 1).toUpperCase() + monthString.substring(1), year, daysInMonth);
    }
}

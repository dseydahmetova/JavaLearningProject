import java.text.NumberFormat;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //constants
        final byte monthsInYear = 12;
        final byte percent = 100;

        int principal = 0;
        float monthRate = 0;
        double numberOfPeriods = 0;
        Scanner calc = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = calc.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float rate = calc.nextFloat();
            if (rate >= 1 && rate <= 30){
                monthRate = rate / percent / monthsInYear;
            break;
        }
        System.out.println("Enter a number greater than 0 and less than or equal to 30.");
    }

        while(true) {
        System.out.print("Period(years): ");
        byte  years = calc.nextByte();
        if(years >= 1 && years <= 30) {
            numberOfPeriods = years * monthsInYear;
            break;
        }
            System.out.println("Enter a number between 1 and 30");
        System.out.print("Mortgage: ");

        double mortgage = principal * monthRate * Math.pow((1 + monthRate), numberOfPeriods) / (Math.pow((1 + monthRate), numberOfPeriods) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print(currency.format(mortgage));
    }
}
import java.text.NumberFormat;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //constants
        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner calc = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = calc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float rate = calc.nextFloat();
        float monthRate = rate / percent / monthsInYear;

        System.out.print("Period(years): ");
        byte  years = calc.nextByte();
        double numberOfPeriods = years * monthsInYear;

        System.out.print("Mortgage: ");

        double mortgage = principal * monthRate * Math.pow((1 + monthRate), numberOfPeriods) / (Math.pow((1 + monthRate), numberOfPeriods) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print(currency.format(mortgage));
    }
}
import java.text.NumberFormat;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = calc.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double rate = calc.nextDouble();
        double monthRate = rate / 100 / 12;

        System.out.print("Period(years): ");
        double period = calc.nextDouble();
        double monthPeriod = period * 12;

        System.out.print("Mortgage: ");

       double mortgage = principal * monthRate * Math.pow((1 + monthRate), monthPeriod) / (Math.pow((1 + monthRate), monthPeriod) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.print(currency.format(mortgage));
    }
}
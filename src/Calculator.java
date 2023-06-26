import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double num2= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operations do you want to perform? ");
        String operation = scanner.nextLine();

        if(operation.equals("sum")) {
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
        } else if (operation.equals("mul")) {
            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
        } else if (operation.equals("div")) {
            System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
        } else {
            System.out.printf("%s is not a supported operation", operation);
        }

    }}

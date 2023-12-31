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

//        if(operation.equals("sum")) {
//            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
//        } else if (operation.equals("sub")) {
//            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
//        } else if (operation.equals("mul")) {
//            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
//        } else if (operation.equals("div")) {
//            if (num2 == 0) {
//                System.out.println("Cannot divide by zero.");
//            } else {
//                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
//            }
//        }
//            else {
//            System.out.printf("%s is not a supported operation", operation);
//        }

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
            break;
            case "sub":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;
            case "div":
                if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
            }
                break;
            default:
                System.out.printf("%s is not a supported operation", operation);

        }

    }}

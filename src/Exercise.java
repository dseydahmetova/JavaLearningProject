import java.util.Scanner;
public class Exercise {
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = obj.nextInt();


        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0)
            System.out.println("Buzz");
            else if (number % 5 == 0)
            System.out.println("Fizz");
            else
            System.out.println(number);

        }
    }



import java.sql.SQLOutput;
import java.util.Scanner;
public class Weather {
    public static void main (String[] args) {
        System.out.print("Enter temp:");
        Scanner obj = new Scanner(System.in);
    int temp = obj.nextInt();
    if(temp >= 30) {
    System.out.println("It's a hot day. ");
    System.out.println("Drink plenty of water.");
}
    else if (temp >= 20)
    System.out.println("It's a nice day");
    else {
    System.out.println("It's cold.");
}
    }
}

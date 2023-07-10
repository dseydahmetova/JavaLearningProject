import java.math.BigInteger;
import java.util.*;
public class Factorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
sc.close();
        calcFactorial(num);
    }

    static void calcFactorial(int n) {
        int i = 1;
        BigInteger factorial = BigInteger.ONE;
        while(i <= n){
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++;
        }
        System.out.println(factorial);
    }

}

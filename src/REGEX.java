import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class REGEX {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    String A = "([01]?[0-9]{1,2}|";
    String B = "2[0-4][0-9]|";
    String C = "25[0-5])";
    String octet = A+B+C;
    String pattern = octet+"."+octet+"."+octet+"."+octet;

}


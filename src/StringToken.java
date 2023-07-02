import java.io.*;
import java.util.*;


public class StringToken {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
   char[] arr = s.toCharArray();

        String replaceString = s.replace('\'',' ');

//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == '\'')
//        arr[i] = ' ';
//        }
//        for (char a : arr)
//            System.out.println(a);

//        System.out.println(Arrays.toString(arr));
        String[] newArr = replaceString.split(" ");
//
        System.out.println(newArr.length);
//
        for (String a : newArr)
            System.out.println(a);
        scan.close();

    }


}

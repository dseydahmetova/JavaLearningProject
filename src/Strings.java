import java.util.Scanner;
public class Strings {

        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'
            String arr[] = new String[s.length() - k + 1];
            largest = s.substring(0,k);
            smallest = s.substring(0,k);
            for(int i = 0; i <= s.length() - k; i++) {
                arr[i] = s.substring(i,i+k);
                if(arr[i].compareTo(smallest) < 0) smallest= arr[i];
                if(largest.compareTo(arr[i]) < 0) largest = arr[i];
            }


            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }

}

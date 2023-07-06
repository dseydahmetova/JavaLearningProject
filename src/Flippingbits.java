import java.util.Scanner;

public class Flippingbits {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int numCases = sc.nextInt();

            for (int i = 0; i < numCases; i++) {
                System.out.println(sc.nextLong() ^ 4294967295L);
            }
            sc.close();

    }
}

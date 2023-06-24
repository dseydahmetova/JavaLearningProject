import java.util.Scanner;

public class ForLoop {
    public static void main (String[] args) {
//        for(int i = 0; i < 5; i++)
//            System.out.println("Hello World!");
//
//        int i = 0;
//        while (i > 0) {
//            System.out.println("Hello world  " + i);
//            i--;
//        }

        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }



//        do {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//        }
//        while(!input.equals("quit"))
    }
}

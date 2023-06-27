import java.util.*;
public class Comparator {
    public static void main( String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue <Integer> pq = new PriorityQueue<>((java.util.Comparator) new CustomComparator());

        int n = sc.nextInt();
        System.out.println("\n----------------------------------------");
        for(int i =0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            switch(x){
                case 1: pq.add(y);
                break;

                case 2: if(pq.size() == 0) System.out.println(-1);
                else System.out.println(pq.peek());
                break;

                case 3: if(pq.peek() != null) pq.poll();
                break;
            }
        }
    }
}


class CustomComparator implements java.util.Comparator< Integer > {
    public int compare (Integer a, Integer b) {
        {
            if (a < b)
                return 1;
            if (a > b)
                return -1;
            return 0;
        }
    }
}

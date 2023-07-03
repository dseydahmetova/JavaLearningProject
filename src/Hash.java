import java.util.*;
public class Hash {

        public int solve(ArrayList<Integer> A, Integer B) {
            if (B == null) {
                return 0;
            } else {
                HashSet<Integer> set = new HashSet<>();
                for (int num : A) {
                    if (set.contains(num + B) || set.contains(num - B)) {
                        return 1; // Found a pair with the required difference
                    }
                    set.add(num);
                }
            }
            return 0;
        }


}

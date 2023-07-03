import java.util.*;
public class Hash {
    // The use of a HashSet allows for efficient lookup of elements, improving the overall time complexity to O(N) instead of O(N^2) in the previous implementation.
        public int solve(ArrayList<Integer> A, Integer B) {
            if (B == null) {
                return 0;
            } else {
                HashSet<Integer> set = new HashSet<>();
                for (int num : A) {
                    set.add(num); // Add elements of the array to the HashSet
                }
                for (int num : A) {
                    if (set.contains(num + B) || set.contains(num - B)) {
                        return 1; // Found a pair with the required difference
                    }
                }
            }
            return 0;
        }


}

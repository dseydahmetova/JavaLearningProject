import java.util. ArrayList;
public class Backtracking {

        public ArrayList<String> specialStrings(ArrayList<String> A) {
            ArrayList<String> res = new ArrayList<>();
            helper(A, res, 0, "");
            return res;
        }
        public void helper(ArrayList<String> l, ArrayList<String> res, int ind, String str) {
            if(ind == l.size()) {
                res.add(str);
                return;
            }
            for(int i = 0; i < l.get(ind).length(); i ++)
                helper(l, res, ind+1, str + l.get(ind).charAt(i));
        }
    }




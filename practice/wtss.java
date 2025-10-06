
import java.util.*;

public class wtss {

    public static void main(String[] args) {
        String p = "abc";
        String q = "123";
        int k = 3;
        System.out.println(distSS(p, q, k));
    }

    public static int distSS(String p, String q, int k) {
        HashSet<String> S = new HashSet<String>();
        int n = p.length();
        for (int i = 0; i < n; ++i) {
            int sum = 0;
            StringBuilder s = new StringBuilder();
            for (int j = i; j < n; ++j) {
                int pos = p.charAt(j) - 'a';
                sum += q.charAt(pos) - '0';
                s.append(p.charAt(j));
                if (sum <= k) {
                    S.add(s.toString());
                } else {
                    break;
                }
            }
        }
        return S.size();
    }
}

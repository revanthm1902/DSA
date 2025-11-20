
import java.util.*;

public class sunqperm {

    public static TreeSet<String> ts = new TreeSet<>();

    public static void genperm(char[] a, int l, int r) {
        if (l == r) {
            String out = "";
            for (int i = 0; i < a.length; i++) {
                out += a[i];
            }
            ts.add(out);
        } else {
            for (int i = l; i <= r; i++) {
                swap(a, l, i);
                genperm(a, l + 1, r);
                swap(a, l, i);
            }
        }
    }

    public static void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        genperm(s.toCharArray(), 0, s.length() - 1);

        for (String ele : ts) {
            System.out.println(ele + " ");
        }
    }
}

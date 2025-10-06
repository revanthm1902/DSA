
import java.util.*;

public class Leader {

    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int n = a.length;
        ArrayList<Integer> leaders = findL(a, n);
        System.out.println(leaders);
    }

    public static ArrayList<Integer> findL(int[] a, int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = a[n - 1];
        leaders.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] >= max) {
                max = a[i];
                leaders.add(max);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}


import java.util.*;

public class crt {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = 1;
        int[] a = new int[n];
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            m[i] = s.nextInt();
            p *= m[i];
        }
        System.out.print(rem(a, m, n, p));
    }

    public static int rem(int[] a, int[] m, int n, int p) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            int M = p / m[i];
            int y = 0;
            for (int j = 0; j < m[i]; j++) {
                if ((M * j) % m[i] == 1) {
                    y = j;
                    break;
                }
            }
            x += a[i] * M * y;
        }
        return (x % p + p) % p;
    }
}

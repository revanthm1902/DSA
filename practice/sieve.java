
import java.util.*;

public class sieve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int k = sc.nextInt();
        if (n <= 2) {
            return;
        }
        boolean[] isp = new boolean[n];
        Arrays.fill(isp, true);
        isp[0] = false;
        isp[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (isp[i]) {
                for (int j = i * i; j < n; j += i) {
                    isp[j] = false;
                }
            }
        }
        // int count = 0;
        for (int i = 2; i < n; i++) {
            // for (int i = 5; i < 15; i++) {

            if (isp[i]) {
                System.out.print(i + " ");
                // count++;
            }
            // if (count == k) {
            //     System.out.print(i);
            // }
        }
        System.out.println();
    }
}

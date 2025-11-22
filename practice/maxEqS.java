
public class maxEqS {

    public static void main(String[] args) {
        int[] a = {1, 7, 3, 6, 5, 6};
        int n = a.length;
        System.out.print(MES(n, a));
    }

    public static int MES(int n, int[] a) {
        int l = 0, r = 0, ans = 0;
        for (int num : a) {
            r += num;
        }
        for (int i = 0; i < n; i++) {
            l += a[i];
            if (l == r) {
                ans = Math.max(ans, l);
            }
            r -= a[i];
        }
        return ans;

    }
}


public class maxEqS {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
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

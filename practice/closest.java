
public class closest {

    public static void main(String[] args) {
        int[] a = {17, 25, 38, 47, 51, 62, 79};
        int x = 50;

        int ans = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= x) {
                ans = a[i];
            } else {
                break;
            }
        }
        System.out.print(ans);
    }
}

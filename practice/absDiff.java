
// public class absDiff {
//     public static void main(String[] args) {
//         int[] a = {1, 3, 5, 7, 9, 11, 13, 15};
//         int x = 10;
//         int k = 1;
//         for (int i = 0; i < a.length; i++) {
//             int diff = Math.abs(a[i] - x);
//             if (diff <= k) {
//                 System.out.print(a[i] + " ");
//             }
//         }
//     }
// }
public class absDiff {

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        int n = a.length;
        int x = 5;
        int k = 3;

        int pos = findpos(a, x);

        int l = pos - 1;
        int r = pos;

        int c = 0;
        while (c < k) {
            if (l >= 0 && r < n) {
                int leftDiff = Math.abs(a[l] - x);
                int rightDiff = Math.abs(a[r] - x);

                if (rightDiff <= leftDiff) {
                    System.out.print(a[r] + " ");
                    r++;
                } else {
                    System.out.print(a[l] + " ");
                    l--;
                }
            } else if (r < n) {
                System.out.print(a[r] + " ");
                r++;
            } else {
                System.out.print(a[l] + " ");
                l--;
            }
            c++;
        }
    }

    public static int findpos(int[] a, int x) {
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= x) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}

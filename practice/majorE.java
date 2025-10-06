
public class majorE {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 2, 2, 1, 1};
        int n = a.length;
        int res = findME(a, n);
        System.out.println(res);
    }

    public static int findME(int[] a, int n) {
        int c = 0, el = 0;
        for (int no : a) {
            if (c == 0) {
                el = no;
                c = 1;
            } else if (no == el) {
                c++;
            } else {
                c--;
            }
        }

        c = 0;
        for (int no : a) {
            if (no == el) {
                c++;
            }
            if (c > n / 2) {
                return el;
            }

        }
        return -1;
    }
}

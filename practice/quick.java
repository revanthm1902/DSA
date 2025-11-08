
public class quick {

    public static void main(String[] args) {
        int[] a = {5, 3, 8, 4, 2};
        sort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static int partition(int[] a, int l, int h) {
        int pi = a[l], i = l + 1, j = h;
        while (i <= j) {
            while (i < h && a[i] < pi) {
                i++;
            }
            while (j > l && a[j] > pi) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            } else {
                break;
            }
        }
        swap(a, j, l);
        return j;
    }

    public static void sort(int[] a, int l, int h) {
        if (l < h) {
            int pi = partition(a, l, h);
            sort(a, l, pi - 1);
            sort(a, pi + 1, h);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

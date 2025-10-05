
public class blockswap {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;
        rotate(a, k);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
        if (k == 0) {
            return;
        }
        swap(a, n - k, n - 1);
        swap(a, 0, n - k - 1);
        swap(a, 0, n - 1);
    }
}

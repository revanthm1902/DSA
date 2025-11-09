
public class quick {

    public static void main(String[] args) {
        int[] a = {7, 4, 6, 4, 4, 6, 1};
        sort(a, 0, a.length - 1);
        boolean found = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.printf("The element %d occurs at the indices %d and %d\n", a[i], i, i + 1);
                found = true;
                break; // stop after first duplicate found
            }
        }

        if (!found) {
            System.out.println("All the values are Distinct");
        }

        // Arrays.sort(nums);
        // return nums[nums.length-k]; // kth largest element
    }

    public static int partition(int[] a, int l, int h) {
        int pi = a[l], i = l + 1, j = h;
        while (i <= j) {
            while (i <= h && a[i] <= pi) {
                i++;
            }
            while (a[j] > pi) {
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

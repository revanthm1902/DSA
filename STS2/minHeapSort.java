import java.util.*;

class minHeapSort {
    static ArrayList<Integer> al = new ArrayList<>();

    static int parent(int i) {
        return (i - 1) / 2;
    }

    static void swap(int a, int b) {
        int temp = al.get(a);
        al.set(a, al.get(b));
        al.set(b, temp);
    }

    static void insert(int d) {
        al.add(d);
        int i = al.size() - 1;
        while (i > 0 && al.get(parent(i)) > al.get(i)) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    static int extractMin() {
        if (al.isEmpty()) return -1;
        int min = al.get(0);
        al.set(0, al.get(al.size() - 1));
        al.remove(al.size() - 1);
        if (!al.isEmpty()) {
            heapify(0);
        }
        return min;
    }

    static void heapify(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < al.size() && al.get(left) < al.get(smallest)) {
            smallest = left;
        }
        if (right < al.size() && al.get(right) < al.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }

        int s[] = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = extractMin();
        }

        System.out.println(Arrays.toString(s));
        sc.close();
    }
}
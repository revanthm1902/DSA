
public class smallernostoright {

    public static void main(String[] args) {
        int[] a = {-1, -1};
        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    c++;
                }
            }
            res[i] = c;
        }
        for (int x : res) {
            System.out.print(x + " ");
        }

    }

}

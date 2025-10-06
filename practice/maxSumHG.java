
public class maxSumHG {

    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        int[][] m = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        System.out.print(msh(r, c, m));
    }

    public static int msh(int r, int c, int[][] m) {
        int max = 0;
        if (r < 3 || c < 3) {
            return -1;
        }
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                int sum = m[i][j] + m[i][j + 1] + m[i][j + 2] + m[i + 1][j + 1] + m[i + 2][j] + m[i + 2][j + 1] + m[i + 2][j + 2];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}

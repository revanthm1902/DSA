
class longest1s {

    public static int findMaxConsecutiveOnes(int[] a, int k) {
        int maxOnes = Integer.MIN_VALUE;
        int numReplacements = 0;
        int i = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] == 0) {
                numReplacements++;
            }
            while (numReplacements > k) {
                if (a[i] == 0) {
                    numReplacements--;
                }
                i++;
            }
            maxOnes = Math.max(maxOnes, j - i + 1);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0};
        int k = 1;
        int result = findMaxConsecutiveOnes(a, k);
        System.out.print(result);
    }
}

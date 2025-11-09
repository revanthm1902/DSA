
public class mergedigisum {

    public static void main(String[] args) {
        int[] a = {123, 456, 789, 321, 654};
        int sum = 15;

        for (int i = 0; i < a.length; i++) {
            if (dsum(a[i]) == sum) {
                System.out.println(a[i]);
                break; // Exit after finding the first match
            }
        }
        int highest = highdsum(a);
        System.out.println(highest);
    }

    public static int dsum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10; // add last digit
            n /= 10;     // remove last digit
        }
        return s;
    }

    public static int highdsum(int a[]) {
        int max = Integer.MIN_VALUE;
        int maxNum = -1;
        for (int i = 0; i < a.length; i++) {
            int curr = dsum(a[i]);
            if (curr > max) {
                max = curr;
                maxNum = a[i];
            }
        }
        return maxNum;
    }
}

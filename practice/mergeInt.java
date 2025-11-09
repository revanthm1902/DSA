
import java.util.*;

public class mergeInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        // Step 1: Sort based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        System.out.println("Merged intervals:");

        // Step 2: Take first interval as the current merged one
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 3: Iterate and merge
        for (int i = 1; i < n; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (end >= nextStart) {
                // overlap → extend the end if needed
                end = Math.max(end, nextEnd);
            } else {
                // no overlap → print the previous merged interval
                System.out.println("[" + start + ", " + end + "]");
                start = nextStart;
                end = nextEnd;
            }
        }

        // print the last merged interval
        System.out.println("[" + start + ", " + end + "]");
    }
}


import java.util.*;

public class mazeSolve {

    static String dir = "DLRU";
    static int[] dr = {1, 0, 0, -1};
    static int[] dc = {0, -1, 1, 0};

    static boolean isValid(int r, int c, int n, int[][] maze) {
        return r >= 0 && c >= 0 && r < n && c < n && maze[r][c] == 1;
    }

    static void findPath(int r, int c, int[][] maze, StringBuilder path, ArrayList<String> res) {
        int n = maze.length;
        if (r == n - 1 && c == n - 1) {
            res.add(path.toString());
            return;
        }
        maze[r][c] = 0;
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (isValid(nr, nc, n, maze)) {
                path.append(dir.charAt(i));
                findPath(nr, nc, maze, path, res);
                path.deleteCharAt(path.length() - 1);
            }
        }
        maze[r][c] = 1;
    }

    static ArrayList<String> ratinMaze(int[][] maze) {
        ArrayList<String> res = new ArrayList<>();
        int n = maze.length;
        StringBuilder path = new StringBuilder();
        if (maze[0][0] == 1 && maze[n - 1][n - 1] == 1) {
            findPath(0, 0, maze, path, res);
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        ArrayList<String> res = new ArrayList<>();
        res = ratinMaze(maze);
        if (res.isEmpty()) {
            System.out.println(-1);
        } else {
            for (String path : res) {
                System.out.print(path + " ");
            }
        }
    }
}

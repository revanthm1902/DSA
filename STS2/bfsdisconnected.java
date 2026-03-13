import java.util.*;

public class bfsdisconnected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            al.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            al.get(v1).add(v2);
            al.get(v2).add(v1);
        }
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                BFS(al, vis, i);
            }
        }
    }

    static void BFS(ArrayList<ArrayList<Integer>> al, boolean[] vis, int s) {
        Queue<Integer> q = new LinkedList<>();
        vis[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");
            for (int n : al.get(cur)) {
                if (!vis[n]) {
                    vis[n] = true;
                    q.add(n);
                }
            }
        }
    }
}

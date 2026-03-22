package Graph;

import java.util.*;

public class graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        LinkedList<Integer>[] adj = new LinkedList[v];
        for (int i = 0; i < v; i++) adj[i] = new LinkedList<>();

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            adj[u].add(w); // 
            adj[w].add(u); // For undirected [cite: 806]
        }
    }
}
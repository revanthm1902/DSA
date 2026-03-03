import java.util.*;

public class topologicalSort {
    private int V;
    private List<List<Integer>> adj;

    public topologicalSort(int v) {
        this.V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    public void topologicalSort() {
        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int node : adj.get(i)) {
                inDegree[node]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;
        List<Integer> topOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topOrder.add(u);
            for (int node : adj.get(u)) {
                if (--inDegree[node] == 0) {
                    queue.add(node);
                }
            }
            count++;
        }

        if (count != V) {
            System.out.println("Cycle detected! Topological sort is not possible for cyclic graphs.");
            return;
        }

        System.out.println("\nTopological Sort order:");
        for (int i : topOrder) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int v = sc.nextInt();
        topologicalSort graph = new topologicalSort(v);

        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the edges (source destination) one by one:");
        System.out.println("Example: For an edge from 0 to 1, type '0 1'");

        for (int i = 0; i < e; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            int source = sc.nextInt();
            int destination = sc.nextInt();
            if (source >= 0 && source < v && destination >= 0 && destination < v) {
                graph.addEdge(source, destination);
            } else {
                System.out.println("Invalid vertices! Please enter values between 0 and " + (v - 1));
                i--;
            }
        }
        graph.topologicalSort();

        sc.close();
    }
}

package Graph;
import java.util.*;
public class finalbfs {
    public static void bfs(int start, List<List<Integer>> adj, boolean[] vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        vis[start]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr+" ");
            for(int neighbour:adj.get(curr)){
                if(!vis[neighbour]){
                    vis[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        int E=s.nextInt();

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        for(int i=0;i<E;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]) bfs(i,adj,vis);
        }
    }
}
        // // Take edges until -1 -1
        // while (true) {
        //     int u = sc.nextInt();
        //     int v = sc.nextInt();

        //     if (u == -1 && v == -1) break;

        //     adj.get(u).add(v);
        //     adj.get(v).add(u);
        // }
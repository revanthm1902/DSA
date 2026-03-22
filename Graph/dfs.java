package Graph;

import java.util.*;
public class dfs{
    public static void DFS(int curr,List<List<Integer>> adj, boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int neighbour:adj.get(curr)){
            if(!vis[neighbour]){
                DFS(neighbour,adj,vis);
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
            if(!vis[i]){
                DFS(i,adj,vis);
            }
        }
    }
}
import java.util.*;
public class bellman {
    static class Edge{
        int u,v,w;
        Edge(int u,int v,int w){
            this.u=u;
            this.v=v;
            this.w=w;
        }
    }
    public static void bellmanFord(int V, List<Edge> edges,int src){
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;

        for(int i=0;i<V-1;i++){
            for(Edge e:edges){
                if(dist[e.u]!=Integer.MAX_VALUE && dist[e.u]+e.w<dist[e.v]){
                    dist[e.v]=dist[e.u]+e.w;
                }
            }
        }
        for(Edge e:edges){
            if(dist[e.u]!=Integer.MAX_VALUE && dist[e.u]+e.w<dist[e.v]){
                System.out.println("-1");
                return;
            }
        }
        for(int i=0;i<V;i++) System.out.print((dist[i]==Integer.MAX_VALUE ? "-1": dist[i])+" ");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        int E=s.nextInt();
        List<Edge> edges=new ArrayList<>();
        for(int i=0;i<E;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            int w=s.nextInt();
            edges.add(new Edge(u,v,w));
        }
        bellmanFord(V,edges,0);
    }
}

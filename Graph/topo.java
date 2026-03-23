package Graph;
import java.util.*;
public class topo {
    public static void dfs(LinkedList<LinkedList<Integer>> l,int v){
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[v];

        for(int i=0;i<v;i++){
            if(!vis[i]) helper(l,vis,i,st);
            while(!st.isEmpty()) System.out.print(st.pop()+" ");
        }
    }
    public static void helper(LinkedList<LinkedList<Integer>> l,boolean[] vis,int s, Stack<Integer> st){
        vis[s]=true;
        for(int adj:l.get(s)){
            if(!vis[adj]) helper(l,vis,adj,st);
        }
        st.push(s);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();

        LinkedList<LinkedList<Integer>> l=new LinkedList<>();
        for(int i=0;i<v;i++) l.add(new LinkedList<>());

        for(int i=0;i<e;i++){
            int u=s.nextInt();
            int v1=s.nextInt();
            l.get(u).add(v1);
        }
        dfs(l,v);
    }
}

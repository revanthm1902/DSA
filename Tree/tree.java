package Tree;
import java.util.*;
public class tree {
    static class Pair{
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root){ // PreOrder Traversal
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){ // InOrder Traversal
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){ // PostOrder Traversal
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void leftview(Node root, int level, ArrayList<Integer> res){ // Left View
        if(root==null) return;
        if(level==res.size()) res.add(root.data);
        leftview(root.left,level+1,res);
        leftview(root.right,level+1,res);
    }
    
    public static void rightview(Node root, int level, ArrayList<Integer> res){ // Right View
        if(root==null) return;
        if(level==res.size()) res.add(root.data);
        rightview(root.right,level+1,res);
        rightview(root.left,level+1,res);
    }

    public static void topview(Node root){ //top view
        if(root==null) return;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair curr=q.poll();

            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.node.left,curr.hd-1));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.node.right,curr.hd+1));
            }
        }
        for(int val:map.values()){
            System.out.print(val+" ");
        }
    }

    public static void bottomview(Node root){ // bottom view
        if(root==null) return;

        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair curr=q.poll();

            map.put(curr.hd,curr.node.data);

            if(curr.node.left!=null){
                q.add(new Pair(curr.node.left,curr.hd-1));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.node.right,curr.hd+1));
            }
        }
        for(int val:map.values()){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        ArrayList<Integer> left = new ArrayList<>();
        leftview(root, 0, left);
        System.out.println("Left view: " + left);
        ArrayList<Integer> right = new ArrayList<>();
        rightview(root, 0, right);
        System.out.println("Right view: " + right);
        topview(root);
        System.out.println();
        bottomview(root);
    }
}

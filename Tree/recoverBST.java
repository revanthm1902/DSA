package Tree;
import java.util.*;
public class recoverBST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BST{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    static Node first=null,second=null,prev=new Node(Integer.MIN_VALUE);
    public static void recoverbst(Node root){
        first=second=null;
        prev=new Node(Integer.MIN_VALUE);

        inOrderFix(root);

        if(first!=null && second!=null){
            int temp=first.data;
            first.data=second.data;
            second.data=temp;
        }
    }
    public static void inOrderFix(Node root){
        if(root==null) return;

        inOrderFix(root.left);

        if(root.data<prev.data){
            if(first==null) first=prev;
            second=root;
        }
        prev=root;

        inOrderFix(root.right);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nodes[]=new int[n];
        
        for(int i=0;i<n;i++) nodes[i]=s.nextInt();

        BST bt=new BST();
        BST.idx=-1;
        Node root=bt.buildTree(nodes);

        recoverbst(root);
        inOrder(root);
    }
}

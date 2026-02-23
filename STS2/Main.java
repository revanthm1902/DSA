import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class qnode {
    int v, l;
    Node n;

    qnode(int v, int l, Node n) {
        this.v = v;
        this.l = l;
        this.n = n;
    }
}

public class Main {
    Node root = null;

    public void create() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if (val == -1)
            return;
        root = new Node(val);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            int l = sc.nextInt();
            if (l != -1) {
                curr.left = new Node(l);
                q.add(curr.left);
            }
            int r = sc.nextInt();
            if (r != -1) {
                curr.right = new Node(r);
                q.add(curr.right);
            }
        }
    }

    public void inorder(Node root) {
        if (root == null)
            return;
        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> tm = new TreeMap<>();
        Queue<qnode> q = new LinkedList<>();
        q.add(new qnode(0, 0, root));
        while (!q.isEmpty()) {
            qnode curr = q.poll();
            int v = curr.v;
            int l = curr.l;
            int data = curr.n.data;
            tm.putIfAbsent(v, new TreeMap<>());
            tm.get(v).putIfAbsent(l, new ArrayList<>());
            tm.get(v).get(l).add(data);
            if (curr.n.left != null) {
                q.add(new qnode(v - 1, l + 1, curr.n.left));
            }
            if (curr.n.right != null) {
                q.add(new qnode(v + 1, l + 1, curr.n.right));
            }
        }
        for (Map.Entry<Integer, TreeMap<Integer, ArrayList<Integer>>> vertical : tm.entrySet()) {
            for (Map.Entry<Integer, ArrayList<Integer>> level : vertical.getValue().entrySet()) {
                for (Integer val : level.getValue()) {
                    System.out.print(val + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.create();
        System.out.println("\nvertical Traversal:");
        obj.inorder(obj.root);
    }
}
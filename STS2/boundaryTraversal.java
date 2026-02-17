
import java.util.*;

class Node {

    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

public class boundaryTraversal {

    static Node buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) {
            return null;
        }

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            Node curr = queue.poll();

            if (i < arr.length && arr[i] != null) {
                curr.left = new Node(arr[i]);
                queue.add(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                curr.right = new Node(arr[i]);
                queue.add(curr.right);
            }
            i++;
        }

        return root;
    }

    static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    static void collectLeft(Node root, List<Integer> res) {
        if (root == null || isLeaf(root)) {
            return;
        }

        res.add(root.data);
        if (root.left != null) {
            collectLeft(root.left, res); 
        }else {
            collectLeft(root.right, res);
        }
    }

    static void collectLeaves(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }

        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }

        collectLeaves(root.left, res);
        collectLeaves(root.right, res);
    }

    static void collectRight(Node root, List<Integer> res) {
        if (root == null || isLeaf(root)) {
            return;
        }

        if (root.right != null) {
            collectRight(root.right, res); 
        }else {
            collectRight(root.left, res);
        }

        res.add(root.data);
    }

    static List<Integer> boundaryTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        if (!isLeaf(root)) {
            res.add(root.data);
        }

        collectLeft(root.left, res);
        collectLeaves(root, res);
        collectRight(root.right, res);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        Integer[] arr = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i].equalsIgnoreCase("null") || input[i].equals("-1")) {
                arr[i] = null; 
            }else {
                arr[i] = Integer.parseInt(input[i]);
            }
        }

        Node root = buildTree(arr);
        List<Integer> result = boundaryTraversal(root);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

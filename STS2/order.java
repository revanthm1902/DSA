
import java.util.*;

class Tnode {

    int data;
    Tnode left, right;

    Tnode(int d) {
        data = d;
        left = right = null;
    }
}

class BT {

    Tnode root = null;

    void create() {
        Scanner sc = new Scanner(System.in);
        int rd = sc.nextInt();
        if (rd == -1) {
            return;
        }

        root = new Tnode(rd);
        Queue<Tnode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Tnode curr = q.poll();

            int l = sc.nextInt();
            if (l != -1) {
                curr.left = new Tnode(l);
                q.add(curr.left);
            }

            int r = sc.nextInt();
            if (r != -1) {
                curr.right = new Tnode(r);
                q.add(curr.right);
            }
        }
    }

    void Inorder(Tnode root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    void Preorder(Tnode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    void Postorder(Tnode root) {
        if (root == null) {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    void Levelorder(Tnode root) {
        if (root == null) {
            return;
        }
        Queue<Tnode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Tnode curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }
}

class order {

    public static void main(String ar[]) {
        BT b = new BT();
        b.create();

        System.out.print("Inorder: ");
        b.Inorder(b.root);

        System.out.print("\nPreorder: ");
        b.Preorder(b.root);

        System.out.print("\nPostorder: ");
        b.Postorder(b.root);

        System.out.print("\nLevelorder: ");
        b.Levelorder(b.root);
    }
}

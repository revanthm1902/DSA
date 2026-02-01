
import java.util.*;

class list {

    node head = null;

    class node {

        int data;
        node next;

        node(int n) {
            data = n;
            next = null;
        }
    }

    void insert(int n) {
        node newn = new node(n);
        if (head == null) {
            head = newn;
        } else {
            node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newn;
        }
    }

    boolean create(int a, int b) {
        int c = 0;
        node p1 = head;
        node p2 = head;
        while (p1.data != a || c != b) {
            if (p1.data != a) {
                p1 = p1.next;
                if (p1.next == null) {
                    return false;
                }
            }
            if (c != b) {
                p2 = p2.next;
                ++c;
            }
        }
        p2.next = p1;
        return true;
    }

    boolean detect() {
        node fast = head;
        node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        if (fast.next == null) {
            return false;
        }
        return false;
    }
}

class loopdetection {

    public static void main(String[] args) {
        list l = new list();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l.insert(sc.nextInt());
        }
        int a = sc.nextInt();
        int b = n - 1;
        l.create(a, b);
        System.out.println(l.detect());
    }
}

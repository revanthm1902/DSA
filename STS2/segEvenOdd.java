
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

    void display() {
        node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "-->");
            cur = cur.next;
        }
        System.out.print("null");
    }

    void seg() {
        node es = null;
        node ee = null;
        node os = null;
        node oe = null;
        node cur = head;
        while (cur != null) {
            if (cur.data % 2 == 0) {
                if (es == null) {
                    es = ee = cur;
                } else {
                    ee.next = cur;
                    ee = cur;
                }
            } else {
                if (os == null) {
                    os = oe = cur;
                } else {
                    oe.next = cur;
                    oe = cur;
                }
            }
            cur = cur.next;
        }
        if (es == null) {
            head = os;
        } else {
            head = es;
            ee.next = os;

        }
        oe.next = null;
    }
}

class segEvenOdd {

    public static void main(String[] args) {
        list l = new list();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            l.insert(s.nextInt());
        }
        l.display();
        l.seg();
        System.out.println();
        l.display();
    }
}


import java.util.*;

class list {

    node head = null;

    class node {

        int data;
        node next;
        node prev;

        node(int n) {
            data = n;
            next = null;
            prev = null;
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
            newn.prev = cur;
        }
    }

    void display() {
        node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "<-->");
            cur = cur.next;
        }
        System.out.print("null");
    }

    void bit() {
        node first = head;
        node last = head;
        node res = null;
        node resend = null;

        while (last.next != null) {
            last = last.next;
        }
        while (first != last) {
            if (first.data <= last.data) {
                if (res == null) {
                    res = resend = first;
                    first = first.next;
                } else {
                    node cur = first.next;
                    resend.next = first;
                    first.prev = resend;
                    cur.prev = null;
                    first = cur;
                    resend = resend.next;
                }
            } else {
                if (res == null) {
                    res = resend = last;
                    last = last.prev;
                } else {
                    node cur = last.prev;
                    resend.next = last;
                    last.prev = resend;
                    cur.next = null;
                    last = cur;
                    resend = resend.next;
                }
            }
        }
        resend.next = first;
        first.prev = resend;
        head = res;
    }
}

class bitonic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        list l = new list();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l.insert(sc.nextInt());
        }
        l.display();
        System.out.println();
        l.bit();
        l.display();
    }
}

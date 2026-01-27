
import java.util.Scanner;

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
        node newnode = new node(n);
        if (head == null) {
            head = newnode;
        } else {
            node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newnode;
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

    list segregateByIndex() {
        list res = new list();
        node es = null, ee = null;
        node os = null, oe = null;

        node cur = head;
        int index = 0;

        while (cur != null) {
            node temp = new node(cur.data);

            if (index % 2 == 0) {
                if (es == null) {
                    es = ee = temp;
                } else {
                    ee.next = temp;
                    ee = temp;
                }
            } else {
                if (os == null) {
                    os = oe = temp;
                } else {
                    oe.next = temp;
                    oe = temp;
                }
            }
            cur = cur.next;
            index++;
        }

        if (es == null) {
            res.head = os;
        } else {
            res.head = es;
            ee.next = os;
        }

        return res;
    }

    list segregateByValue() {
        list res = new list();
        node es = null, ee = null;
        node os = null, oe = null;

        node cur = head;

        while (cur != null) {
            node temp = new node(cur.data);

            if (temp.data % 2 == 0) {
                if (es == null) {
                    es = ee = temp;
                } else {
                    ee.next = temp;
                    ee = temp;
                }
            } else {
                if (os == null) {
                    os = oe = temp;
                } else {
                    oe.next = temp;
                    oe = temp;
                }
            }
            cur = cur.next;
        }

        if (es == null) {
            res.head = os;
        } else {
            res.head = es;
            ee.next = os;
        }

        return res;
    }
}

class seg {

    public static void main(String ar[]) {
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();

        list l = new list();
        for (int i = 0; i < n; i++) {
            l.insert(sw.nextInt());
        }

        System.out.println("Original List:");
        l.display();

        System.out.println("\n\nIndex Based Segregation:");
        list indexList = l.segregateByIndex();
        indexList.display();

        System.out.println("\n\nValue Based Segregation (Even/Odd):");
        list valueList = l.segregateByValue();
        valueList.display();
    }
}

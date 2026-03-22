
import java.util.*;

public class SLL {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    static Node head = null;

    static void append(int d) {
        Node newn = new Node(d);
        if (head == null) {
            head = newn;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
    }

    static void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    static void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            append(n);
        }
        deleteFirst();
        deleteLast();
        display();
    }
}

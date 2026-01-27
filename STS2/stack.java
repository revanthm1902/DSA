
import java.util.Scanner;

class StackArray {

    int[] arr;
    int top;
    int size;

    StackArray(int n) {
        size = n;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Array Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Array Stack Underflow");
            return;
        }
        System.out.println("Array Stack Popped: " + arr[top--]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Array Stack Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class StackLL {

    Node top = null;

    class Node {

        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Linked List Stack Underflow");
            return;
        }
        System.out.println("Linked List Stack Popped: " + top.data);
        top = top.next;
    }

    void display() {
        if (top == null) {
            System.out.println("Linked List Stack Empty");
            return;
        }
        Node cur = top;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

public class stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Stack using Array:");
        StackArray sa = new StackArray(5);
        sa.push(10);
        sa.push(20);
        sa.push(30);
        sa.display();
        sa.pop();
        sa.display();

        System.out.println("\nStack using Singly Linked List:");
        StackLL sl = new StackLL();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.display();
        sl.pop();
        sl.display();
    }
}

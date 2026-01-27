
class QueueArray {

    int[] q;
    int front, rear, size;

    QueueArray(int n) {
        size = n;
        q = new int[size];
        front = rear = -1;
    }

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Array Queue Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        q[++rear] = x;
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Array Queue Underflow");
            return;
        }
        System.out.println("Array Queue Dequeued: " + q[front++]);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Array Queue Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}

class QueueLL {

    Node front = null, rear = null;

    class Node {

        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    void enqueue(int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Linked List Queue Underflow");
            return;
        }
        System.out.println("Linked List Queue Dequeued: " + front.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Linked List Queue Empty");
            return;
        }
        Node cur = front;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

public class queue {

    public static void main(String[] args) {

        System.out.println("Queue using Array:");
        QueueArray qa = new QueueArray(5);
        qa.enqueue(10);
        qa.enqueue(20);
        qa.enqueue(30);
        qa.display();
        qa.dequeue();
        qa.display();

        System.out.println("\nQueue using Singly Linked List:");
        QueueLL ql = new QueueLL();
        ql.enqueue(10);
        ql.enqueue(20);
        ql.enqueue(30);
        ql.display();
        ql.dequeue();
        ql.display();
    }
}

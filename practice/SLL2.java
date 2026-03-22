
import java.util.*;

class SLL2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SLL l = new SLL();
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            l.append(n);
        }
        l.odd_even_segregation();
        l.display();
    }
}

class node {

    int data;
    node next;

    node(int d) {
        data = d;
        next = null;
    }
}

class SLL {

    node head = null;

    void append(int d) {
        node newn = new node(d);
        if (head == null) {
            head = newn;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
    }

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void odd_even_segregation() {
        node evenstart = null, evenend = null;
        node oddstart = null, oddend = null;
        node temp = head;
        int position = 1;
        while (temp != null) {
            node next = temp.next;
            if (position % 2 == 0) {
                if (evenstart == null) {
                    evenstart = evenend = temp;
                } else {
                    evenend.next = temp;
                    evenend = evenend.next;
                }
            } else {
                if (oddstart == null) {
                    oddstart = oddend = temp;
                } else {
                    oddend.next = temp;
                    oddend = oddend.next;
                }
            }
            position++;
            temp = next;
        }
        if (evenstart == null) {
            head = oddstart;
        } else if (oddstart == null) {
            head = evenstart;
        } else {
            head = evenstart;
            evenend.next = oddstart;
            oddend.next = null;
        }
    }
}

// import java.util.*;

// class node{
//     int data;
//     int pr;
//     node next;
//     node prev;
//     node(int n,int pri){
//         data=n;
//         pr=pri;
//         next=null;
//         prev=null;
//     }
// }
// class pQ{
//     static node front=null;
//     static node rear=null;
//     static void insert(int n,int pri){
//         node newn=new node(n,pri);
//         if(front==null){
//             front=rear=newn;
//         }
//         else if(pri<front.pr){
//             newn.next=front;
//             front.prev=newn;
//             front=newn;
//         } else{
//             node temp=front;
//             while(temp.next!=null && temp.next.pr<=pri){
//                 temp=temp.next;
//             }
//             if(temp.next)
//         }
//     }
// }
import java.util.*;

class pQ {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            int pri = sc.nextInt();
            pq.add(new int[]{val, pri});

        }
        while (!pq.isEmpty()) {
            int cur[] = pq.poll();
            System.out.println(cur[0] + " " + cur[1]);
        }
    }
}

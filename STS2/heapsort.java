import java.util.*;
public class heapsort {
    public static void  heapify(int[] arr, int n, int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && arr[l]>arr[largest]) largest=l;
        if(r<n && arr[r]>arr[largest]) largest=r;

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            System.out.println(Arrays.toString(arr));

            heapify(arr,n,largest);
        }
    }
    static void heapSort(int[] arr,int n){
        for(int i=n/2 -1;i>=0;i--) heapify(arr,n,i);
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=s.nextInt();

        heapSort(arr,n);
        for(int val:arr) System.out.print(val+" ");
    }
}

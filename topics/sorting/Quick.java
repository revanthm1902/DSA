public class Quick {
    public static void main(String[] args){
        int[] a={5 ,3,  8,  1,  4,  6,  2,  7};
        sort(a,0,a.length-1);
        printA(a);
    }
    public static void printA(int[] a){
        for(int x:a) System.out.print(x+" ");
    }

    public static int partition(int[] a,int l, int h){
        int pi=a[l];
        int i=l+1,j=h;

        while(i<=j){
            while(i<=h && a[i]<pi) i++;
            while(j>=l && a[j]>pi) j--;

            if(i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            } else break;
        }
        int t=a[j];
        a[j]=a[l];
        a[l]=t;
        return j;
    }
    public static void sort(int[] a,int l,int h){
        if(l<h){
            int pi=partition(a,l,h);
            sort(a,l,pi-1);
            sort(a,pi+1,h);
        }
    }
}

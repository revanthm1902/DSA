public class Merge{
    public static void main(String[] args){
        int[] a={7,8,3,1,2};
        mergeSort(a,0,a.length-1);
        printA(a);
    }
    public static void printA(int[] a){
        for(int x:a){
            System.out.print(x+" ");
        }
    }

    public static void merge(int[] a,int l, int m, int r){
        int merged[]=new int[r-l+1];
        int i1=l;
        int i2=m+1;
        int x=0;

        while(i1<=m && i2<=r){
            if(a[i1]<=a[i2]){
                merged[x++]=a[i1++];
            } else{
                merged[x++]=a[i2++];
            }
        }
        while(i1<=m){
            merged[x++]=a[i1++];
        }
        while(i2<=r){
            merged[x++]=a[i2++];
        }

        for(int i=0,j=l;i<merged.length;i++,j++){
            a[j]=merged[i];
        }
    }

    public static void mergeSort(int[] a,int l,int r){
        if(l>=r){
            return;
        }
        int m=l+(r-l)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);

        merge(a,l,m,r);
    }
}
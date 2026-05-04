import java.util.*;
public class fib {
    static int fibNum(int n){
            if(n<=1) return n;
            return fibNum(n-1)+fibNum(n-2);
        }
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fibNum(n));
        // int a=0,b=1;
        // for(int i=0;i<n;i++){
        //     System.out.print(a+" ");
        //     int c=a+b;
        //     a=b;
        //     b=c;
        // }

        
    }
}

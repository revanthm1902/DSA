import java.util.*;
public class Karatsuba {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int prod=karatsuba(n1,n2);
        System.out.println(prod);
    }
    public static int karatsuba(int n1,int n2){
        if(n1<10 || n2<10) return n1*n2;
        int n=Math.max(count(n1),count(n2));
        int m=n/2;
        int p=(int)Math.pow(10,m);
        int a=n1/p;
        int b=n1%p;
        int c=n2/p;
        int d=n2%p;

        int ac=karatsuba(a,c);
        int bd=karatsuba(b,d);
        int abcd=karatsuba(a+b,c+d);
        int res=(ac*(int)Math.pow(10,2*m))+((abcd-ac-bd)*p)+bd;
        return res;
    }
    public static int count(int x){
        if(x==0) return 1;
        int c=0;
        while(x>0){
            c++;
            x/=10;
        }
        return c;
    }
}

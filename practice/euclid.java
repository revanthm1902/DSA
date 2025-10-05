import java.util.*;
public class euclid {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int g=gcd(a,b);
        System.out.println(g);
    }
    public static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}

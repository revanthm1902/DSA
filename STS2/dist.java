import java.util.*;
public class dist {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[] str=s.nextLine().split(" ");
        int k=s.nextInt();

        Map<Integer,Integer> freq=new HashMap<>();
        for(String st:str){
            int type=Integer.parseInt(st);
            freq.put(type,freq.getOrDefault(type,0)+1);
        }
        for(int c:freq.values()){
            if(c>2*k){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }    
}

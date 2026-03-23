import java.util.*;
public class maxSlidingWindow {
    public static int[] msw(int[] nums, int k){
        if(nums==null || nums.length==0) return new int[0];
        int n=nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.pollFirst();

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) dq.pollLast();
            dq.offerLast(i);

            if(i>=k-1) res[i-k+1]=nums[dq.peekFirst()];
        }
        return res;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) nums[i]=s.nextInt();

        int res[]=msw(nums,k);
        for(int val:res) System.out.print(val+" ");
    }
}

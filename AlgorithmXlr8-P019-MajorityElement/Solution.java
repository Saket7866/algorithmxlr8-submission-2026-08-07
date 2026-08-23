import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();
        HashMap<Long, Integer> map = new HashMap<>();
        for( int j = 0 ; j<n ; j++)
        {
            if(map.containsKey(nums[j]))
            {
                map.put(nums[j], map.get(nums[j])+1);
            }
            else 
            {
                map.put(nums[j],1);
            }
            if(map.get(nums[j])> n/2)
            {
                System.out.print(nums[j]);
                 return;
            }
            
        }


        // Write your solution here.
        // Print the element that appears more than n / 2 times.
    }
}

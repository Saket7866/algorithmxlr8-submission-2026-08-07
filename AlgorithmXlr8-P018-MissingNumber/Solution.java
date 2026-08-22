import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();
        HashSet<Long> seen = new HashSet<>();
        for( int j = 0; j< nums.length ; j++)
        {
            seen.add(nums[j]);
        }
        long k = 0;
        while(k<=n)
        {
           if(seen.contains(k)== false) {
            System.out.print(k);
           }
           k++;
        }
        return;
        


        // Write your solution here.
        // Print the one number in [0, n] that is missing from nums.
    }
}

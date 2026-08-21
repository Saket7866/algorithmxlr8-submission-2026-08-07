import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long target = sc.nextLong();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();
        for ( int  j = 0 ; j< n ; j++)
        {
            for ( int k = j + 1 ; k<n ; k++)
                {
                    if(nums [j] + nums[k] == target)
                    {
                        System.out.println(j + " " + k);
                        return;
                    }
                }            
        }

        // Write your solution here.
        // Print the two indices (space-separated) whose values sum to target.
    }
}

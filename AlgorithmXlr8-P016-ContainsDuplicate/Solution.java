import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();
        HashSet<Long> seen = new HashSet<>();
        for(int j = 0 ; j< nums.length ; j++)
        {
            if(seen.contains(nums[j]))
            {
                System.out.println("true");
                return;
            }
            seen.add(nums[j]);
        }
        System.out.println("false");
        return;

        // Write your solution here.
        // Print "true" if any value appears at least twice, otherwise "false".
    }
}

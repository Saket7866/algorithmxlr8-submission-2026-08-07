import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        int k = 0;
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();
        for ( int j = 0 ; j< n ; j++)
        {
           if(nums[j] != 0)
           {
            nums[k] = nums[j];
            k++;
           }
        }
        for (int l = k ; l< n ; l++)
        {
            nums[l] = 0;

        }
        for(int p = 0 ; p < n ; p++)
        {
            System.out.print(nums[p]+ " ");
        }
        return;
       
        // Write your solution here.
        // Print nums after moving all zeroes to the end, preserving the
        // relative order of the non-zero elements, space-separated.
    }
}

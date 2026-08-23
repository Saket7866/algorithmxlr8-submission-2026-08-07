import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextLong();
        long [] arr = new long[n];
        
        for ( int j = 0 ; j < n ;j++ )
        {
         long mul = 1; 
         for( int k = 0 ; k< n ; k++)
         {  
             if ( k == j)
             {
                continue ;
             }
            // arr[j] = nums[k]*mul ;
             mul = mul * nums[k]; 
         }
            arr[j] = mul ;
        }
        for( int l = 0 ; l< n ; l++)
        {
            System.out.print(arr[l] + " ");
        }
        return;
        

        // Write your solution here.
        // Print an array where each position holds the product of every other
        // element, without using division, space-separated.
    }
}

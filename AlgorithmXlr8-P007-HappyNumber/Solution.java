import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> seen = new HashSet<>();
        int n = sc.nextInt();
        int sum = 0  ;
        while(n != 1)
        {   

            if(seen.contains(n))
            {
                System.out.println("false");
                return;
            }
            seen.add(n);
            while(n > 0) // calculate square sum of digit 
        {   
            int k = n%10 ;
            sum = sum + (k)*(k) ;
            n = n/10;     
        }
         
         n = sum ; 
    
                         // swap num with sum 
         sum = 0;        // reset sum 
        }
        System.out.println("true");
        return;

        // Write your solution here.
        // Print "true" if n is a happy number, otherwise print "false".
    }
}

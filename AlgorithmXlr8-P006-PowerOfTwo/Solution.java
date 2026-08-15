import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long current = 1 ;

        while(current <= n)
        {
            if(n == current)
            {
              System.out.println("true");
               break;
            }

            else 
            {
                current = current * 2;
            }
        }
        if (current > n)
        {
            System.out.println("false");
        }
       
        
        // Write your solution here.
       // Print "true" if n is a power of two, otherwise print "false".
    }
}

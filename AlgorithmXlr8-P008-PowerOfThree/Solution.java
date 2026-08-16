import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long current = 1;
        while(current <=n )
        {
            if(current == n )
            {
                System.out.println("true");
                return;
            }
            else 
            {
               current = current *3; 
            }
        }
        System.out.println("false");
        return;


        // Write your solution here.
        // Print "true" if n is a power of three, otherwise print "false".
    }
}

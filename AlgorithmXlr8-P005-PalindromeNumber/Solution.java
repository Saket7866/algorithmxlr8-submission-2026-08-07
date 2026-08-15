import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long p = x ;
        long  reverse = 0;
        while (p >0)
        {
            reverse  = reverse *10 + p%10;
             p = p/10;

        }
        if (x == reverse)
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }

        

        // Write your solution here.
        // Print "true" if x is a palindrome, otherwise print "false".
    }
}

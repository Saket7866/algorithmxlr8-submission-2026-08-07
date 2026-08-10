import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        
       while(num >9)
       {
        long sum = 0;
        while(num >0)
        {
          sum = sum + num%10;
          num = num /10;
         }
         num = sum ;
       }
       System.out.println(num);
       
      
        // Write your solution here.
        // Print the single-digit result of repeatedly summing num's digits.
    }
}

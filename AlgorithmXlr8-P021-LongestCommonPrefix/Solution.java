import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        StringBuilder result = new StringBuilder();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) strs[i] = sc.next();



        for ( int j = 0 ; j< strs[0].length(); j++)
        {
             boolean matched = true;

            for( int k = 1 ; k< n ;k++)
            {
                if(strs[k].length()<= j)
                {
                    matched = false ;
                    break ;
                }

                else if (strs[0].charAt(j) != strs[k].charAt(j))
                {
                    matched = false ;
                    break;
                }

            }

            if(matched == false)
            {
                break;
            }
             result.append(strs[0].charAt(j));
        }
        System.out.print(result);
        // Write your solution here.
        // Print the longest common prefix among all strings in strs, or an
        // empty line if there is none.
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int k = ch.length -1;
        char temp ;
        for(int i = 0 ; i<k ; i++)
        {
           temp =  ch[i];
           ch[i] = ch[k];
           ch[k] = temp;
           k--;
        }
        String str = new String(ch);
        System.out.println(str);
        return;


        // Write your solution here.
        // Print s reversed.
    }
}

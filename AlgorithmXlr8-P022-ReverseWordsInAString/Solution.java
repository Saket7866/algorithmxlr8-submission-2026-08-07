import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp ;
        int i = 0;
        

       String[] word = s.split("\\s+");
       int j  = word.length -1 ;
       while (i<j)
       {

        temp = word[i];
        word[i]= word[j];
        word[j] = temp;
        i++;
        j--;

       }

       String result = String.join(" ", word);
       System.out.println(result);

        
       

        // Write your solution here.
        // Print s with the order of its words reversed, collapsing any leading,
        // trailing, or multiple spaces down to single spaces between words.
    }
}

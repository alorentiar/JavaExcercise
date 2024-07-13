import java.io.*;
import java.util.*;

public class Palindrome {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String A = sc.next();
            /* Enter your code here. Print output to STDOUT. */
            int low = 0;
            int high = A.length() - 1;
            int identifier = 1;

            while (low < high) {
                if (A.charAt(low) != A.charAt(high)) {
                    identifier = 0;
                    break;
                }
                low++;
                high--;
                identifier = 1;
            }

            if (identifier == 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }


        }




}

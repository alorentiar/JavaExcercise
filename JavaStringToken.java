import java.io.*;
import java.util.*;
public class JavaStringToken {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.
            String regex = "[ !,?\\._'@]";
            String[] listStr = Arrays.stream(s.split(regex)).filter(str -> !str.isEmpty()).toArray(String[]::new);
            System.out.println(listStr.length);

            for(String str : listStr) {
                System.out.println(str);
            }
            scan.close();


        }


}

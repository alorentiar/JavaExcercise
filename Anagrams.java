import java.util.Scanner;
public class Anagrams {


        static boolean isAnagram(String a, String b) {
            // Complete the function
            a = a.toLowerCase();
            b = b.toLowerCase();

            if(a.length()!= b.length()){
                return false;
            }else{
                char[] charAToArray = a.toCharArray();
                char[] charBToArray = b.toCharArray();
                java.util.Arrays.sort(charAToArray);
                java.util.Arrays.sort(charBToArray);
                return java.util.Arrays.equals(charAToArray, charBToArray);
            }




        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        }

}

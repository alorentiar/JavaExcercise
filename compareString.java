import java.util.Scanner;

public class compareString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        //asumsikan smallest dan largest pada substring yang sama
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
//         "Compare to" method doesn't turn just the equel case it also turns a value.
        //looping dimulai dr awal ampe akhir
        for(int i=0; i<=s.length()-k; i++ ){
            //ini looping dari 0 ke akhir
            String str = s.substring(i,k+i);
            //jika lebih dari 0, berarti yang paling kecil itu string
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            //jika < 0 berarti largestnya lebih kecil
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }



        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
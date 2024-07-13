import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        Currency usd = Currency.getInstance("USD");
        Currency inr = Currency.getInstance("INR");
        Currency cny = Currency.getInstance("CNY");
        Currency eur = Currency.getInstance("EUR");

        Locale loc = new Locale("IN","IN");

        NumberFormat inrFormatter
                = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        inrFormatter.setCurrency(inr);
        NumberFormat usdFormatter
                = NumberFormat.getCurrencyInstance(Locale.US);
        usdFormatter.setCurrency(usd);
        NumberFormat eurFormatter
                = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        eurFormatter.setCurrency(eur);
        NumberFormat chnFormatter
                = NumberFormat.getCurrencyInstance(Locale.CHINA);
        chnFormatter.setCurrency(cny);

        BigDecimal amt = new BigDecimal(input);
        String currInr = inrFormatter.format(amt);
        String currUs = usdFormatter.format(amt);
        String currUk = eurFormatter.format(amt);
        String currCny = chnFormatter.format(amt);

        System.out.println("US: "+currUs);
        System.out.println("India: "+currInr);
        System.out.println("China: "+currCny);
        System.out.println("France: "+currUk);
    }
}
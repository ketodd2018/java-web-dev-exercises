package exercises;

import java.util.Arrays;

public class SplitQuote {
    public static void main(String[] args){
        String quote = "I would not, could not, in a box." +
                "I would not, could not with a fox." +
                "I will not eat them in a house." +
                "I will not eat them with a mouse.";
        String [] quoteArray = quote.split("\\.");
//        for (String a:quoteArray){
//            System.out.println(a);
//        }
        System.out.println(Arrays.toString(quoteArray));
    }
}

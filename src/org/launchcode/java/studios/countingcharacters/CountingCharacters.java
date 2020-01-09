package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Map<Character, Integer> counts = new HashMap<>();
        String quote = "If the product of two terms is zero then common sense says at least" +
                "one of the two terms has to be zero to start with. So if you move all" +
                "the terms over to one side, you can put the quadratics into a form" +
                "that can be factored allowing that side of the equation to equal zero." +
                "Once you've done that, it's pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();
        char searchTerm = 'a';
        for (char character : charactersInString){
            if (!counts.containsKey(character))
                counts.put(character, 1);
        }
        for (char character : charactersInString){
            int numOfChars = counts.get(character);
            numOfChars = numOfChars +1;
            counts.put(character, numOfChars);
        }
        System.out.println(counts);
    }
}

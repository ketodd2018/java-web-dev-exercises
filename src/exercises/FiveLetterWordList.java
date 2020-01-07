package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetterWordList {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        words.add("sleep");
        words.add("dream");
        words.add("haunt");
        words.add("plays");
        words.add("loves");
        words.add("pillow");
        words.add("blanket");
        words.add("roll");
        System.out.println("How many letters in your word: ");
        int search = input.nextInt();
        for(String word :words) {
            if (word.length() == search) {
                System.out.println(word);
            }
        }
        input.close();
    }
}

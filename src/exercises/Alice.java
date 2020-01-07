package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister" +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                "thought Alice 'without pictures or conversation?";
        System.out.println("What word would you like to search for: ");
        String search = input.next();
        System.out.println(quote.toLowerCase().contains(search.toLowerCase()));
        System.out.println(quote.indexOf(search));
        System.out.println(search.length());
    }
}

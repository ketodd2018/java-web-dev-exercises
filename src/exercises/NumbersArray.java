package exercises;

import java.util.ArrayList;

public class NumbersArray {
    public static void main(String[] args){
    int numbers[];
    numbers = new int[]{1,1,2,3,5,8};

    for (int number:numbers){
        if(!(number %2 == 0)){
            System.out.println(number);
        }
    }
    }
}

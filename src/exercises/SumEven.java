package exercises;

import java.util.ArrayList;

public class SumEven {
    public static void main (String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < 10; i++){
            numbers.add(i);
            if(i %2 == 0){
                total = total + i;
            }
        }

        System.out.println(total);
    }
}

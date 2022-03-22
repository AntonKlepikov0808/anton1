package lesson_5;

import java.nio.charset.Charset;
import java.util.Random;

public class Switch {
    public static void switchIndex(String[] array, int firstIndex, int secondIndex){
        String x;
        x = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = x;
    }

    public static void main(String[] args) {
        String[] listOfString = new String[10];

        for (int i = 0; i < 10; i++) {
            byte[] array = new byte[7];
            new Random().nextBytes(array);
            listOfString[i] =  new String(array, Charset.forName("UTF-8"));
            System.out.print(listOfString[i] + " ");
        }

        switchIndex(listOfString, 0, 9);

        for(String string: listOfString){
            System.out.println(string);
        }

    }
}
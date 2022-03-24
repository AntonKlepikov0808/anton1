package Lesson_6;
import java.util.Random;
import java.util.stream.Collectors;

public class Task {

    public static void main(String[] args) {
        int randomFirstIndex = (int) (1 + Math.random() * 8);
        int randomSecondIndex = (int) (1 + Math.random() * 8);
        String symbols = "0123456789i";
        String rightSymbols = "0123456789";

        String[][] stringArray = new String[randomFirstIndex][randomSecondIndex];
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                stringArray[i][j] = new Random().ints(1, 0, symbols.length())
                        .mapToObj(symbols::charAt)
                        .map(Object::toString)
                        .collect(Collectors.joining());
            }
        }

        String[][] rightSizeArray = new String[4][4];
        for (int i = 0; i < rightSizeArray.length; i++) {
            for (int j = 0; j < rightSizeArray[i].length; j++) {
                rightSizeArray[i][j] = new Random().ints(2, 0, symbols.length())
                        .mapToObj(symbols::charAt)
                        .map(Object::toString)
                        .collect(Collectors.joining());
            }
        }

        String[][] rightStringArray = new String[4][4];
        for (int i = 0; i < rightStringArray.length; i++) {
            for (int j = 0; j < rightStringArray[i].length; j++) {
                rightStringArray[i][j] = new Random().ints(3, 0, rightSymbols.length())
                        .mapToObj(rightSymbols::charAt)
                        .map(Object::toString)
                        .collect(Collectors.joining());
            }
        }

        try {
            System.out.println(Handler.handlerArray(stringArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(Handler.handlerArray(rightSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(Handler.handlerArray(rightStringArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

class Handler {
    public static int handlerArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 && array[0].length != 4)
            throw new MyArraySizeException("Размер массива не соответствует ");
        int sum = 0;
        int[][] tempIntArray = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    tempIntArray[i][j] = Integer.parseInt(array[i][j]);
                    sum += tempIntArray[i][j];
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException("Нельзя спросить", i, j);
                }

            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception{
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception{
    int firstIndex;
    int secondIndex;
    public MyArrayDataException(String message, int firstIndex, int secondIndex) {
        super(message + " " + firstIndex + " " + secondIndex);
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
    }
}
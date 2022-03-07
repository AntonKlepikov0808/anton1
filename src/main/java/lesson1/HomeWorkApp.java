package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange\n");
        System.out.println("Banana\n");
        System.out.println("Apple\n");
    }

    public static void checkSumSign() {
        int a = 7;
        int b = 11;
        if(a + b > 0) {
            System.out.println("Сумма положительная");
        }
        System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 11;
        if(value <= 0) {
            System.out.println("Красный");
        } else if(value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else System.out.println("Зелёный");
    }

    public static void compareNumbers() {
        int a = 9;
        int b = 15;
        if(a >= b) {
            System.out.println("a >= b");
        }
        System.out.println("a < b");
    }


}
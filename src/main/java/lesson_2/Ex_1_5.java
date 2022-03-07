
package lesson_2;

public class Ex_1_5 {
    public static void main(String[] args) {
        checkSum(5, 9);
        checkForPositivity(-100);
        System.out.println(checkForPositivityElse(10));
        printString(3, "My Home Work");
        checkYear(2004);




    }

    public static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else return false;
    }

    public static void checkForPositivity(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        }
        System.out.println("Отрицательное");
    }

    public static boolean checkForPositivityElse(int a) {
        if (a >= 0) {
            return true;
        }
        return false;
    }

    public static void printString(int a, String string) {
        for (int i = 0; i < a; i++){
            System.out.println(string);
        }
    }

    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 100 == 0) {
                return false;
            } else {
                return year % 4 == 0;
            }
        }
    }

}
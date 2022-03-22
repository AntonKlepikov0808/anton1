package lesson_5;
import java.util.Arrays;
import java.util.List;

/**
 * Homework 1
 */
public class Switch {
    public static void main(String[] args) {

        String[] arr = {"asd", "ds", "ret", "123"};
        //Integer[] arr = {3, 4, 6, 234, -1324, 111};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static void swapElements(String[] arr, int i, int i1) {
    }
}
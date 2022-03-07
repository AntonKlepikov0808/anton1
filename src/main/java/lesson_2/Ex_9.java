package lesson_2;

public class Ex_9 {
    public static void main(String[] args) {
        createArray(228, 326);
    }

    public static int[] createArray(int len, int initialValue) {
        int array[] = new int[len];
        for (int i : array) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
        return array;
    }
}
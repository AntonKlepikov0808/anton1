package lesson_2;

public class Ex_6 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arrll; i++) {
            System.out.println(i + "-" + arr[i]);
        }
    }
}
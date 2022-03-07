package lesson_2;

public class Ex_8 {
    public static void main(String[] args) {
        int[][] array = new int[15][15];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    array[i][j] = 1;
                } else array[i][j] = 33;
                System.out.print(array[i][j]+" ");
            }

        }
    }
}
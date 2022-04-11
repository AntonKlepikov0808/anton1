package Lesson_12;

public class TriangleTest {
    public static void main(String args[]) {

        int a = 7;
        int b = 3;
        int c = 8 ;
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            int s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Площадь треугольника: " + area);
        } else
            System.out.println("Площаль треугольника неизвестна");
    }
}


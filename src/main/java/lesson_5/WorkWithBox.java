package lesson_5;

public class WorkWithBox {
    public static void main(String[] args) {
        Box bigBox = new Box();
        Box littleBox = new Box();
        Box veryBigBox = new Box();
        Box smallBox = new Box();

        for (int i = 0; i < 0 + (int) (Math.random() * 50); i++) {
            if (0 + (int) (Math.random() * 100) < 50) {
                bigBox.addFruitInBox(new Apple());
            } else bigBox.addFruitInBox(new Orange());
        }

        for (int i = 0; i < 10 + (int) (Math.random() * 50); i++) {
            if (0 + (int) (Math.random() * 100) < 50) {
                littleBox.addFruitInBox(new Apple());
            } else littleBox.addFruitInBox(new Orange());
        }

        for (int i = 0; i < 10 + (int) (Math.random() * 50); i++) {
            if (0 + (int) (Math.random() * 100) < 50) {
                veryBigBox.addFruitInBox(new Apple());
            } else veryBigBox.addFruitInBox(new Orange());
        }

        for (int i = 0; i < 10 + (int) (Math.random() * 50); i++) {
            if (0 + (int) (Math.random() * 100) < 50) {
                smallBox.addFruitInBox(new Apple());
            } else smallBox.addFruitInBox(new Orange());
        }


        bigBox.addFruitToAnotherBox(littleBox, 1 + (int) (Math.random() * 10));
        bigBox.addFruitToAnotherBox(smallBox, 1 + (int) (Math.random() * 10));
        bigBox.addFruitToAnotherBox(veryBigBox, 1 + (int) (Math.random() * 10));
        smallBox.addFruitToAnotherBox(littleBox, 1 + (int) (Math.random() * 10));


        System.out.println(bigBox.compare(littleBox));
        System.out.println(bigBox.compare(smallBox));
        System.out.println(bigBox.compare(veryBigBox));
        System.out.println(bigBox.compare(bigBox));


    }
}
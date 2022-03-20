package lesson_5;

import java.util.ArrayList;

public class Box {
    double wightBox = 0;
    ArrayList<Fruit> fruitInBox = new ArrayList<Fruit>();


    public void addFruitInBox(Fruit fruit) {
        if (this.fruitInBox.isEmpty() || this.fruitInBox.get(0).getClass() == fruit.getClass()) {
            this.fruitInBox.add(fruit);
            this.wightBox = this.wightBox + fruit.weight;
        } else System.out.println("Не путай тёплое с мягким");
    }

    public double getWightBox(){
        wightBox = 0;
        for(Fruit fruit:fruitInBox){
            wightBox = wightBox + fruit.weight;
        }
        return wightBox;

    }

    public boolean compare(Box box) {
        if (this.getWightBox() == box.getWightBox()) {
            return true;
        } else return false;
    }

    public void addFruitToAnotherBox(Box box, int howManyFruit) {
        if(fruitInBox.size() > howManyFruit) {
            if (this.fruitInBox.get(0).getClass() == box.fruitInBox.get(0).getClass() || box.fruitInBox.isEmpty()) {
                ArrayList<Fruit> tempFruitArray = new ArrayList<Fruit>();
                for (int i = 0; i < howManyFruit; i++) {
                    tempFruitArray.add(this.fruitInBox.get(i));
                    this.wightBox = this.wightBox - this.fruitInBox.get(i).weight;
                    box.wightBox = box.wightBox + this.fruitInBox.get(i).weight;
                }
                box.fruitInBox.addAll(tempFruitArray);
                this.fruitInBox.removeAll(tempFruitArray);
            } else System.out.println("Не путай тёплое с мягким");
        }
        else System.out.println("Здесь столько нет");
    }
}
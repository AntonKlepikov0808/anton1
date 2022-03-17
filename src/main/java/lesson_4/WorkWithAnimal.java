package lesson_4;
class dogandcat {
}
abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    private static int howManyAnimal = 0;
    private boolean satiety = false;

    Animal(){
        howManyAnimal++;
    }

    abstract void run(int length);
    abstract void swim(int length);

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }


    public static void setHowManyAnimal(int howManyAnimal) {

        Animal.howManyAnimal = howManyAnimal;
    }

    public static int getHowManyAnimal() {

        return howManyAnimal;
    }


    void eat(int howManyFood, Plate plate) {
        if (howManyFood > plate.getHowManyFoodInPlate()) {
            System.out.println("Кот не может поесть");
        } else {
            setSatiety(true);
            plate.setHowManyFoodInPlate(plate.getHowManyFoodInPlate() - howManyFood);
        }
    }


}

class Cat extends Animal
{   private final int MAX_RUN_LENGTH = 200;
    private boolean satiety = false;
    public static int howManyCat = 0;

    Cat(){
        howManyCat++;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void setHowManyCat(int howManyCat) {
        Cat.howManyCat = howManyCat;
    }

    public static int getHowManyCat() {
        return howManyCat;
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }

}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    private static int howManyDog = 0;

    public void setHowManyDog(int howManyDog) {
        Dog.howManyDog = howManyDog;
    }

    public static int getHowManyDog() {
        return howManyDog;
    }


    Dog(){
        howManyDog++;
    }


    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }


}

class Plate{
    private int howManyFoodInPlate = 0;


    public void setHowManyFoodInPlate(int howManyFoodInPlate) {
        this.howManyFoodInPlate = howManyFoodInPlate;
    }

    public int getHowManyFoodInPlate() {
        return howManyFoodInPlate;
    }

    void addFoodInPlate(int howManyFood){
       this.howManyFoodInPlate += howManyFood;
   }


}




public class WorkWithAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(200);
        cat.swim(1);
        Cat anotherCat = new Cat();



        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);


        System.out.println(Animal.getHowManyAnimal());
        System.out.println(Cat.getHowManyCat());
        System.out.println(Dog.getHowManyDog());

        Cat[] listOfCat = new Cat[5];
        listOfCat[0] = new Cat();
        listOfCat[1] = new Cat();
        listOfCat[2] = new Cat();
        listOfCat[3] = new Cat();
        listOfCat[4] = new Cat();

        Plate bigPlate = new Plate();
        bigPlate.addFoodInPlate(20);
        for(Cat superCat : listOfCat){
            superCat.eat((int)(1 + Math.random()*5),bigPlate);
            System.out.println(superCat.isSatiety());
        }
    }
}
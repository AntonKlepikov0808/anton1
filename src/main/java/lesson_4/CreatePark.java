package lesson_4;

public class CreatePark{
    public static void main(String[] args) {
        Park firstPark = new Park("хали-гали", "пара-трупер",12);
    }

}

class Park {
    private Attraction attraction;
    private String parkName ;

    Park(String parkName, String nameAttraction, int costAttraction){
        this.parkName = parkName;
        Attraction attraction = new Attraction(nameAttraction, costAttraction);
    }

    class Attraction{
        private String nameAttraction;
        private int costAttraction;

        Attraction(String nameAttraction, int costAttraction){
            this.nameAttraction = nameAttraction;
            this.costAttraction = costAttraction;
        }
    }

}
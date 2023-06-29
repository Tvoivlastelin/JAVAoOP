package HWsem1_oop;

import java.util.List;

public class Maiin {
    public static void main(String[] args) {
        Activity act = new Activity();
        act.addAnimals(new Dog("Dog Bobik", 2, "male", 15, 2));
        act.addAnimals(new Cat("Cat Pusha", 7, "female", 5, 3));
        act.addAnimals(new Rabbit("Rabbit Baks", 1, "male", 2, 4));
        act.addAnimals(new Capibara("Capibara Victor", 3, "male", 55, 10));

        List<Animals> aa = (List<Animals>) act.getAnimalsList();

        for (Animals animals : act.getAnimalsList()){
            animals.getGolos();
            System.out.println(animals.getName());
            act.getMove();
            act.getFidding(200);
            System.out.println('\n');


        }
        System.out.println(act.getFeed("Cat Pusha"));
        System.out.println(act.getFeed("Capibara Victor"));
        System.out.println(aa);


    }
}

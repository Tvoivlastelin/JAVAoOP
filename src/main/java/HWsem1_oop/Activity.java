package HWsem1_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Activity {

    private final List<Animals> animalsList;

    public Activity() {
        this.animalsList = new ArrayList<>();
    }

    public void addAnimals(Animals animals) {
        animalsList.add(animals);
    }

    public Animals getFeed(String name) {
        for (Animals animals : animalsList) {
            if (animals.getName().equals(name)) {
                animalsList.remove(animals);
                animals.eda += 2;
                animalsList.add(animals);
                return animals;
            }
        }
        return null;
    }
    public void getMove() {
        System.out.println("бежит к вам");
    }

    public void getFidding(int count) {
        System.out.println("Животное поедает " + count + " грамм корма");
    }

    public List<Animals> getAnimalsList() {
        return animalsList;
    }

    @Override
    public String toString() {
        return String.format("Animals: %s", animalsList);
    }
}



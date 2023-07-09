package HWsem4_oop;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public int getWeight() {
        int sum = 0;
        for (T box : fruits) {
            sum += box.getWeight();
        }
        return sum;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void moveTo(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}

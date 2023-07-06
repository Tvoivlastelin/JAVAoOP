package HWsem3_oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Comparable<Container>, Iterable <Box> {

    public int getWeight() {
        int sum = 0;
        for (Box box : boxes) {
            sum += box.getWeight();
        }
        return sum;
    }
    public int getCount() {
        int count = 0;
        int sum = 0;
        for (Box box : boxes) {
            sum += box.getWeight();
            count++;
        }
        return count ;
    }
    private final List<Box> boxes;

    public Container(List<Box>boxes) {
        this.boxes=boxes;
    }

    @Override
    public int compareTo(Container o) {
        return Integer.compare(this.getWeight(),o.getWeight());
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}




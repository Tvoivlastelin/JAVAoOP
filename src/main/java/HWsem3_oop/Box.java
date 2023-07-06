package HWsem3_oop;


import lombok.Data;

@Data

public class Box {
    private int weight;

    public Box(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

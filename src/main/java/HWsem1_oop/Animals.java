package HWsem1_oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animals {
    private String name;
    private int old;
    private String sex;
    protected int ves;
    protected int eda;

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", old=" + old + "years" +
                ", sex='" + sex + '\'' +
                ", ves=" + ves + "kg" +
                ", eda=" + eda + "шт" +
                '}';
    }

    public void getGolos() {
        System.out.println("Животное подает голос");
    }
}


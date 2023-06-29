package HWsem1_oop;

public class Dog extends Animals {
    public Dog(String name, int old, String sex, int ves, int eda) {
        super(name, old, sex, ves, eda);
    }

    @Override
    public void getGolos() {
        System.out.println("Гав -гав -гав");
    }

}



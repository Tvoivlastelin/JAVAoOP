package HWsem1_oop;

public class Rabbit extends  Animals{
    public Rabbit(String name,int old,String sex, int ves, int eda) {
        super(name,old,sex,ves,eda);
    }
    @Override
    public void getGolos() {
        System.out.println("трали вали");
    }

}

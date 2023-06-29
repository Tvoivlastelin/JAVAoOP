package HWsem1_oop;

public class Capibara extends  Animals{
    public Capibara(String name,int old,String sex, int ves, int eda) {
        super(name,old,sex,ves,eda);
    }
    @Override
    public void getGolos() {
        System.out.println("AAAAAAAAA");
    }

}

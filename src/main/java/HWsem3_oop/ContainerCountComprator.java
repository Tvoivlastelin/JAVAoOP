package HWsem3_oop;

import java.util.Comparator;

public class ContainerCountComprator implements Comparator <Container> {

    @Override
    public int compare(Container o1, Container o2) {
        if (Integer.compare(o1.getCount(),o2.getCount())==0){
            System.out.println("Контейнеры одинаковы по объему "+ o1.getCount());
           return o2.getWeight();
        } else if (Integer.compare(o1.getCount(),o2.getCount())<0) {
            System.out.println("1 контейнер больше по объему "+ o2.getCount());
            return o2.getWeight();
        }else {
            System.out.println("2 контейнер больше по объему "+ o1.getCount());
            return o1.getWeight();
        }
    }
}


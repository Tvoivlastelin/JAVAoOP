package HWsem3_oop;


import java.util.ArrayList;
import java.util.List;

//Создать класс Контейнер - Container.
//        В контейнере могут быть ящики (класс Box).
//
//        У каждого ящика есть вес.
//        У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков,
//        которые находятся в контейнере.
//
//        Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера
//        (чем меньше вес, тем меньше контейнер).
//        Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству
//        ящиков (чем меньше ящиков, тем меньше контейнер).
//        Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.
//
//        Container c = new Container(...);
//// ...
//        for (Box box: c) {
//        box - это контейнер
//        }
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(100);
        Box box2 = new Box(5);
        Box box3 = new Box(5);
        Box box4 = new Box(100);
        Box box5 = new Box(5);
        Box box6 = new Box(1);

        List<Box> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);

        Container container = new Container(boxes);
        int conteinerWeight = container.getWeight();
        System.out.println("Вес первого контейнера: " + conteinerWeight);

        List<Box> boxes1 = new ArrayList<>();
        boxes1.add(box6);
        boxes1.add(box5);
        boxes1.add(box4);

        Container container1 = new Container(boxes1);

        int comparison = container.compareTo(container1);
        if (comparison < 0) {
            System.out.println("первый контейнер легче второго");
        } else if (comparison > 0) {
            System.out.println("первый контейнер тяжелее второго");
        } else {
            System.out.println("контенеры весят одинаково");
        }
        for (Box box : container) {
            System.out.println("Вес ящика первого контейнера: " + box.getWeight());
        }
        for (Box box : container1) {
            System.out.println("Вес ящика второго контейнера: " + box.getWeight());
        }
        ContainerCountComprator corp = new ContainerCountComprator();
        System.out.println(corp.compare(container1, container));

        for (Box box : boxes) {
            System.out.printf("%s\t%n", box.getWeight());
        }
    }
}

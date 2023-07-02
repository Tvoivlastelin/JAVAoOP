package HWsem2_oop;

//Предположим, вы разрабатываете какую-то компьютерную игру, в которой есть несколько типов объектов (классов):
//        1 - Здание (имеет текущий уровень здоровья)
//        2 - Герой (имеет текущий уровень здоровья и текущий уровень магической энергии)
//        3 - Нейтральный персонаж (имеет текущий уровень здоровья)
//        Примеры того, как это может выглядеть:
//        https://d3upx5peno0o6w.cloudfront.net/guides1png_1620826387.png
//        https://xgm.guru/files/100/242011/HP-Bar.png
//
//        Также у вас есть класс Render с методом showIndicator, который срабатывает при
//        наведении мышки на объект и работает следующим образом:
//        1 - Если объект обладает уровнем здоровья, то отображается индикатор с текущим
//        уровнем здоровья.
//        2 - Если объект обладает уровнем магический энергии, то отображается индикатор с
//        текущим уровнем энергии.
//        В качестве упрощения, пусть вывод на дисплей это запись информации в консоль.
//        То есть вы пишете код, который выводит на консоль информацию.
//
//        Подсказка: нужно ввести 2 интерфейса: наличие здоровья и наличие магической энергии.
//        В классе Render проверять только на эти интерфейсы и выводить нужную информацию.
//        Необходимо продумать, какие методы должны быть в интерфейсе.
//        .
//
//        ЧТО ДЕЛАТЬ НЕ НУЖНО:
//        Нельзя завязываться на конкретные классы. Предполагается, что таких классов очень много
//        и они постоянно добавляются.
//
//        Необязательные задания, которые не относятся к теме, но при сильном желании можно реализовать.
//        Со звездочкой : реализовать в консоли отображение индикатора.
//        Например, при максимальном уровне здоровья 100 и текущем 40 можно отобразить вот такую
//        ленточку: [xxxx ]
//        С двумя звездочками : раскрасить вывод. Чем меньше здоровья, тем "краснее" цвет индикатора.
//        Для полного здоровья - цвет зеленый.
public class Top {

    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealth(50);
        Hero hero = new Hero(20, 5);
        hero.setCurrentHealth(14);
        hero.setCurrentMana(3);
        Neutral neutral = new Neutral(15);
        neutral.setCurrentHealth(0);
        Neutral neutral1 = new Neutral(15);
        neutral1.setCurrentHealth(4);

        System.out.println(building.getName());
        render.showIndicator(building);
        System.out.println("-----------------------------");
        System.out.println(hero.getName());
        render.showIndicator(hero);
        System.out.println("-----------------------------");
        System.out.println(neutral.getName());
        render.showIndicator(neutral);
        System.out.println("-----------------------------");
        System.out.println(neutral1.getName());
        render.showIndicator(neutral1);

    }
}



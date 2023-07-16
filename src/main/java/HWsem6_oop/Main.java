package HWsem6_oop;


import HWsem6_oop.Work3.*;
import HWsem6_oop.work1.Rectangle;
import HWsem6_oop.work1.Square;
import HWsem6_oop.work2.AccountReportGenerator;
import HWsem6_oop.work2.DocumentReportGenerator;

public class Main {


    public static void main(String[] args) {
        System.out.println("_________________________");
        Rectangle rec = new Rectangle();
        rec.setHeight(6);
        rec.setWidth(2);
        System.out.println(rec.area());

        Square sq = new Square();
        sq.setSide(8);
        System.out.println(sq.area());
        System.out.println("-------------------------");

        Greeter greeter = new Greeter(new FormalGreeting());
        System.out.println(greeter.greet());

        greeter.setGreeting(new CasualGreeting());
        System.out.println(greeter.greet());

        greeter.setGreeting(new DefaultGreeting());
        System.out.println(greeter.greet());

        greeter.setGreeting(new IntimateGreeting());
        System.out.println(greeter.greet());
        System.out.println("-------------------------");

        DocumentReportGenerator dxmlr = new DocumentReportGenerator();
        System.out.println(dxmlr.generateXml());
        System.out.println(dxmlr.generateJson());

        AccountReportGenerator acc = new AccountReportGenerator();
        System.out.println(acc.generateJson());
    }
}
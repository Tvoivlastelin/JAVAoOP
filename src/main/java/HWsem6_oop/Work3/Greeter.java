package HWsem6_oop.Work3;

public class Greeter {
    private GreetingStrategy greeting;

    public Greeter(GreetingStrategy greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return this.greeting.greet();
    }

    public void setGreeting(GreetingStrategy greeting) {
        this.greeting = greeting;
    }
}
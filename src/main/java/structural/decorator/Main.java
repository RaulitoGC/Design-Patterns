package structural.decorator;

public class Main {

    public static void main(String[] args) {
        Coffee coffee =  new SomeCoffee();
        Coffee coffee1 = new AnotherCoffee();

        System.out.println(coffee.getCost() + "  " + coffee.getDescription());
        System.out.println(coffee1.getCost() + "  " + coffee1.getDescription());

        coffee = new WithoutSugar(coffee);
        System.out.println(coffee.getCost() + "  " + coffee.getDescription());

        coffee1 = new WithSugar(coffee1);
        System.out.println(coffee1.getCost() + "  " + coffee1.getDescription());
    }
}

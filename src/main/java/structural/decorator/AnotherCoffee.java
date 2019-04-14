package structural.decorator;

public class AnotherCoffee implements Coffee {
    @Override
    public int getCost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Another coffee";
    }
}

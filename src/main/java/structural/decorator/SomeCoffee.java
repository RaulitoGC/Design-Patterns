package structural.decorator;

public class SomeCoffee implements Coffee {
    @Override
    public int getCost() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Some coffee";
    }
}

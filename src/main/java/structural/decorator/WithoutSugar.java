package structural.decorator;

public class WithoutSugar extends CoffeeDecorator {

    public WithoutSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() - 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", without sugar";
    }
}

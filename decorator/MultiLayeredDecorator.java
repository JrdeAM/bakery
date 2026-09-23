package decorator;

import cake.Cake;

public class MultiLayeredDecorator extends CakeDecorator {

    public MultiLayeredDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + super.getDescription();
    }
}
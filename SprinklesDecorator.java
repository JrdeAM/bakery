public class SprinklesDecorator extends CakeDecorator {

    public SprinklesDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sprinkles";
    }
}

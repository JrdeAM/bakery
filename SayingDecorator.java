public class SayingDecorator extends CakeDecorator {

    private String saying;

    public SayingDecorator(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " with saying \""
                + saying
                + "\"";
    }
}

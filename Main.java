import cake.*;
import decorator.*;
import decorator.MultiLayeredDecorator;
import decorator.SayingDecorator;
import decorator.SprinklesDecorator;
import order.*;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();

        // Bolo de chocolate
        order.addCake(
                new ChocolateCake());

        // Bolo de baunilha com dizer PLAIN
        order.addCake(
                new SayingDecorator(
                        new VanillaCake(),
                        "PLAIN!"));

        // Bolo de baunilha com granulado e dizer FANCY
        order.addCake(
                new SayingDecorator(
                        new SprinklesDecorator(
                                new VanillaCake()),
                        "FANCY"));

        // Bolo de morango completo
        order.addCake(
                new SayingDecorator(
                        new SayingDecorator(
                                new SprinklesDecorator(
                                        new SprinklesDecorator(
                                                new MultiLayeredDecorator(
                                                        new StrawberryCake()))),
                                "One of"),
                        "EVERYTHING"));

        // Print the order
        order.printOrder();
    }
}

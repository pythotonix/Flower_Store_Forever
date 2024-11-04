package apps.ucu.edu.ua.forever.decorator;

import apps.ucu.edu.ua.forever.model.Flower;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return 4 + flower.getPrice();
    }

    @Override
    public String getDescription() {
        return flower.getName() + " in a basket";
    }
}

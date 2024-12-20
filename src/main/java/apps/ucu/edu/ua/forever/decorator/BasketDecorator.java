package apps.ucu.edu.ua.forever.decorator;

import apps.ucu.edu.ua.forever.model.Flower;

public class BasketDecorator extends ItemDecorator {

    private static final double BASKET_COST = 4.0;

    public BasketDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return BASKET_COST + getFlower().getPrice();
    }

    @Override
    public String getDescription() {
        return getFlower().getName() + " in a basket";
    }
}

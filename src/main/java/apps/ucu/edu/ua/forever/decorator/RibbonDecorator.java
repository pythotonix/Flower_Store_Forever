package apps.ucu.edu.ua.forever.decorator;

import apps.ucu.edu.ua.forever.model.Flower;

public class RibbonDecorator extends ItemDecorator {

    private static final double RIBBON_COST = 40.0;

    public RibbonDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return RIBBON_COST + flower.getPrice();
    }

    @Override
    public String getDescription() {
        return flower.getName() + " with a ribbon";
    }
}

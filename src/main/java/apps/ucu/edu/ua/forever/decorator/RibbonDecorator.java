package apps.ucu.edu.ua.forever.decorator;

import apps.ucu.edu.ua.forever.model.Flower;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return 40 + flower.getPrice();
    }

    @Override
    public String getDescription() {
        return flower.getName() + " with a ribbon";
    }
}

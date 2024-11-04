package apps.ucu.edu.ua.forever.decorator;

import apps.ucu.edu.ua.forever.model.Flower;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return 13 + flower.getPrice();
    }

    @Override
    public String getDescription() {
        return flower.getName() + " wrapped in paper";
    }
}

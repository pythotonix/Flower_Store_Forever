package apps.ucu.edu.ua.forever.decorator;

import apps.ucu.edu.ua.forever.model.Flower;

public class PaperDecorator extends ItemDecorator {

    private static final double PAPER_COST = 13.0;

    public PaperDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return PAPER_COST + getFlower().getPrice();
    }

    @Override
    public String getDescription() {
        return getFlower().getName() + " wrapped in paper";
    }
}

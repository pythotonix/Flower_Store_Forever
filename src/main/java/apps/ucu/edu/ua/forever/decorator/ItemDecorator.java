package apps.ucu.edu.ua.forever.decorator;

import apps.ucu.edu.ua.forever.model.Flower;

public abstract class ItemDecorator extends Flower {
    protected Flower flower;

    public ItemDecorator(Flower flower) {
        this.flower = flower;
    }

    public abstract String getDescription();

    @Override
    public double getPrice() {
        return flower.getPrice();
    }
}

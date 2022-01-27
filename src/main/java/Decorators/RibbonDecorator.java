package Decorators;

import flowerstore.Item;
import lombok.ToString;

@ToString
public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice(){
        return 40 + this.item.getPrice();
    }

    @Override
    public String getString() {
        return item.getString() + " with ribbon";
    }
}
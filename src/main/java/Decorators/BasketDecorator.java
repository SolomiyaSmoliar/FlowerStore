package Decorators;

import flowerstore.Item;
import lombok.ToString;

@ToString
public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice(){
        return 4 + this.item.getPrice();
    }

    @Override
    public String getString() {
        return item.getString() + " with basket";
    }
}
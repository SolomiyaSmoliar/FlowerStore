package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private int amount;
    private Flower flower;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public FlowerPack(Flower flower, int amount){
        setFlower(flower);
        setAmount(amount);
    }
}

package flowerstore;


import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@ToString @Setter
public class CactusFlower extends Flower{
    private double price;
    private double sepalLength;
    private FlowerType flowertype;
    private Color color;

    public CactusFlower(){
        setFlowertype(FlowerType.CACTUS);
    }

    public CactusFlower(int sepalLength, int price, FlowerType flowerType , Color color) {
        setSepalLength(sepalLength);
        setPrice(price);
        setFlowerType(flowerType);
        setColor(color);
    }

    public double getPrice(){
        return this.price;
    }
}
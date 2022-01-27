package flowerstore;

import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@ToString @Setter
public class RomashkaFlower extends Flower{
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;


    public RomashkaFlower(){
        setFlowerType(FlowerType.ROMASHKA);
    }

    public RomashkaFlower(int sepalLength, int price, FlowerType flowerType , Color color) {
        setSepalLength(sepalLength);
        setPrice(price);
        setFlowerType(flowerType.ROMASHKA);
        setColor(color);
    }
    public double getPrice(){
        return this.price;
    }
}
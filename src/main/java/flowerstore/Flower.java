package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerType flowerType;
    private Color color;

    public Flower(int sepalLength, int price, FlowerType flowerType , Color color) {
        setSepalLength(sepalLength);
        setPrice(price);
        setFlowerType(flowerType);
        setColor(color);
    }
}

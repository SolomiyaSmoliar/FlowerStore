package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPackList) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addPack(FlowerPack flowerPack) {
        flowerPackList.add(flowerPack);
    }
}

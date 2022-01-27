package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class FlowerBucket implements Item {

    List<Flower> flowers = new ArrayList<>();

    public double getPrice(){
        double price = 0;
        for (int i = 0; i < flowers.size(); i++){
            price += flowers.get(i).getPrice();
        }
        return price;
    }

    @Override
    public String getString() {
        return this.toString();
    }

    public  void addFlower(Flower flower){
        flowers.add(flower);
    }

}

package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Getter @Setter
public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();
    private FlowerType type;
    private double price, sepalL;
    private int[] color;

    public Store(ArrayList<FlowerBucket> flowerBuckets){
        this.flowerBuckets = flowerBuckets;
    }

    public Store(){

    }

    public void addBucket(FlowerBucket flowerBucket){
        flowerBuckets.add(flowerBucket);
    }

    public List<FlowerPack> search(int filterParam){
        FlowerBucket bucket;
        FlowerPack pack;
        List<FlowerPack> packsFound = new ArrayList<>();
        for (int i = 0; i < flowerBuckets.size(); i++){
            bucket = flowerBuckets.get(i);
            for (int j = 0; j < bucket.flowerPackList.size(); j++){
                pack = bucket.flowerPackList.get(j);
                if (filterParam == 0)
                    if (type.equals(pack.getFlowerType()))
                        packsFound.add(pack);

                if (filterParam == 1)
                    if (price == pack.getPrice())
                        packsFound.add(pack);

                if(filterParam == 2)
                    if (sepalL == pack.getSepLen())
                        packsFound.add(pack);

                if (filterParam == 3)
                    if (Arrays.equals(color, pack.getColor()))
                        packsFound.add(pack);
            }
        }
        return packsFound;
    }

}
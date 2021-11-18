package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(40, 10, FlowerType.ROSE, Color.RED);
    }

    @Test
    void getSepalLength() {
        assertEquals(40, flower.getSepalLength());
    }

    @Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }

    @Test
    void getColor() {
        assertEquals(Color.RED, flower.getColor());
    }
}
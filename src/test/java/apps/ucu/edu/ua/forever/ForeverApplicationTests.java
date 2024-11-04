package apps.ucu.edu.ua.forever;

import apps.ucu.edu.ua.forever.model.Flower;
import apps.ucu.edu.ua.forever.decorator.BasketDecorator;
import apps.ucu.edu.ua.forever.decorator.PaperDecorator;
import apps.ucu.edu.ua.forever.decorator.RibbonDecorator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ForeverApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testRibbonDecorator() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(10.0);

        Flower ribbonedFlower = new RibbonDecorator(flower);
        
        assertEquals(50.0, ribbonedFlower.getPrice(), "Price with ribbon should be 50.0 (10 + 40)");
        assertEquals("Rose with a ribbon", ribbonedFlower.getDescription(), "Description should include 'with a ribbon'");
    }

    @Test
    void testPaperDecorator() {
        Flower flower = new Flower();
        flower.setName("Tulip");
        flower.setPrice(8.0);

        Flower paperWrappedFlower = new PaperDecorator(flower);
        
        assertEquals(21.0, paperWrappedFlower.getPrice(), "Price with paper should be 21.0 (8 + 13)");
        assertEquals("Tulip wrapped in paper", paperWrappedFlower.getDescription(), "Description should include 'wrapped in paper'");
    }

    @Test
    void testBasketDecorator() {
        Flower flower = new Flower();
        flower.setName("Lily");
        flower.setPrice(15.0);

        Flower basketFlower = new BasketDecorator(flower);
        
        assertEquals(19.0, basketFlower.getPrice(), "Price with basket should be 19.0 (15 + 4)");
        assertEquals("Lily in a basket", basketFlower.getDescription(), "Description should include 'in a basket'");
    }

}

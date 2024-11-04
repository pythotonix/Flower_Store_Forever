package apps.ucu.edu.ua.forever;

import apps.ucu.edu.ua.forever.model.Flower;
import apps.ucu.edu.ua.forever.decorator.BasketDecorator;
import apps.ucu.edu.ua.forever.decorator.PaperDecorator;
import apps.ucu.edu.ua.forever.decorator.RibbonDecorator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
class ForeverApplicationTests {

    // private static final double BASE_PRICE_ROSE = 10.0;
    // private static final double RIBBON_COST = 40.0;
    // private static final double E_RIBBON_PRICE = BASE_PRICE_ROSE + RIBBON_COST;

    // private static final double BASE_PRICE_TULIP = 8.0;
    // private static final double PAPER_COST = 13.0;
    // private static final double E_PAPER_PRICE = BASE_PRICE_TULIP + PAPER_COST;

    // private static final double BASE_PRICE_LILY = 15.0;
    // private static final double BASKET_COST = 4.0;
    // private static final double E_BASKET_PRICE = BASE_PRICE_LILY + BASKET_COST;

    @Test
    void contextLoads() {
    }

    // @Test
    // void testRibbonDecorator() {
    //     Flower flower = new Flower();
    //     flower.setName("Rose");
    //     flower.setPrice(BASE_PRICE_ROSE);

    //     Flower ribbonedFlower = new RibbonDecorator(flower);

    //     Assertions.assertEquals(
    //         E_RIBBON_PRICE, 
    //         ribbonedFlower.getPrice(),
    //         "Price with ribbon should be " + E_RIBBON_PRICE 
    //         + " (" + BASE_PRICE_ROSE + " + " + RIBBON_COST + ")"
    //     );
    //     Assertions.assertEquals(
    //         "Rose with a ribbon", 
    //         ribbonedFlower.getDescription(), 
    //         "Description should include 'with a ribbon'"
    //     );
    // }

    // @Test
    // void testPaperDecorator() {
    //     Flower flower = new Flower();
    //     flower.setName("Tulip");
    //     flower.setPrice(BASE_PRICE_TULIP);

    //     Flower paperWrappedFlower = new PaperDecorator(flower);

    //     Assertions.assertEquals(
    //         E_PAPER_PRICE, 
    //         paperWrappedFlower.getPrice(),
    //         "Price with paper should be " + E_PAPER_PRICE 
    //         + " (" + BASE_PRICE_TULIP + " + " + PAPER_COST + ")"
    //     );
    //     Assertions.assertEquals(
    //         "Tulip wrapped in paper", 
    //         paperWrappedFlower.getDescription(), 
    //         "Description should include 'wrapped in paper'"
    //     );
    // }

    // @Test
    // void testBasketDecorator() {
    //     Flower flower = new Flower();
    //     flower.setName("Lily");
    //     flower.setPrice(BASE_PRICE_LILY);

    //     Flower basketFlower = new BasketDecorator(flower);

    //     Assertions.assertEquals(
    //         E_BASKET_PRICE, 
    //         basketFlower.getPrice(),
    //         "Price with basket should be " + E_BASKET_PRICE 
    //         + " (" + BASE_PRICE_LILY + " + " + BASKET_COST + ")"
    //     );
    //     Assertions.assertEquals(
    //         "Lily in a basket", 
    //         basketFlower.getDescription(), 
    //         "Description should include 'in a basket'"
    //     );
    // }
}

import application.beans.Purchase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void purchaseAmountTest() {
        int price = 10;
        int discount = 1;
        int numberOfProducts = 2;
        double purchaseAmount = (price - (((double) discount / 100) * price)) * numberOfProducts;
        Purchase purchase = new Purchase("Test", price, discount, numberOfProducts);
        Assertions.assertEquals(purchaseAmount, purchase.getPurchaseAmount());
    }
}
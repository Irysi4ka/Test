import application.beans.Purchase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void purchaseAmountTestOne() {
        int price = 10;
        int discount = 1;
        int numberOfProducts = 2;
        double purchaseAmount = (price - (((double) discount / 100) * price)) * numberOfProducts;
        Purchase purchase = new Purchase("Test", price, discount, numberOfProducts);
        Assertions.assertEquals(purchaseAmount, purchase.getPurchaseAmount());
    }

    @Test
    public void purchaseAmountTestTwo() {
        int price = 100;
        int discount = 25;
        int numberOfProducts = 1;
        double purchaseAmount = (price - (((double) discount / 100) * price)) * numberOfProducts;
        Purchase purchase = new Purchase("Test", price, discount, numberOfProducts);
        Assertions.assertEquals(purchaseAmount, purchase.getPurchaseAmount());
    }

    @Test
    public void purchaseAmountTestThree() {
        int price = 99999999;
        int discount = 99999;
        int numberOfProducts = 9999999;
        double purchaseAmount = (price - (((double) discount / 100) * price)) * numberOfProducts;
        Purchase purchase = new Purchase("Test", price, discount, numberOfProducts);
        Assertions.assertEquals(purchaseAmount, purchase.getPurchaseAmount());
    }

    @Test
    public void buyTestOne(){

    }

}
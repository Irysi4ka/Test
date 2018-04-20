import application.beans.Purchase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void purchaseAmountTest() {
        //case 1
        int price = 10;
        int discount = 1;
        int numberOfProducts = 2;
        double purchaseAmount = (price - (((double) discount / 100) * price)) * numberOfProducts;
        Purchase purchase = new Purchase("Test", price, discount, numberOfProducts);
        Assertions.assertEquals(purchaseAmount, purchase.getPurchaseAmount());
        System.out.println(purchase + "\n");

        //case 2
        int price2 = 100;
        int discount2 = 25;
        int numberOfProducts2 = 1;
        double purchaseAmount2 = (price2 - (((double) discount2 / 100) * price2)) * numberOfProducts2;
        Purchase purchase2 = new Purchase("Test 2", price2, discount2, numberOfProducts2);
        Assertions.assertEquals(purchaseAmount2, purchase2.getPurchaseAmount());
        System.out.println(purchase2 + "\n");

        //case 3
        int price3 = 1;
        int discount3 = 101;
        int numberOfProducts3 = 4;
        double purchaseAmount3 = (price3 - (((double) discount3 / 100) * price3)) * numberOfProducts3;
        Purchase purchase3 = new Purchase("Test 3", price3, discount3, numberOfProducts3);
        Assertions.assertEquals(purchaseAmount3, purchase3.getPurchaseAmount());
        System.out.println(purchase3 + "\n");

        //case 4
        int price4 = 0;
        int discount4 = 0;
        int numberOfProducts4 = 0;
        double purchaseAmount4 = (price4 - (((double) discount4 / 100) * price4)) * numberOfProducts4;
        Purchase purchase4 = new Purchase("Test 4", price4, discount4, numberOfProducts4);
        Assertions.assertEquals(purchaseAmount4, purchase4.getPurchaseAmount());
        System.out.println(purchase4 + "\n");

        //case 5
        int price5 = 99999999;
        int discount5 = 99999;
        int numberOfProducts5 = 9999999;
        double purchaseAmount5 = (price5 - (((double) discount5 / 100) * price5)) * numberOfProducts5;
        Purchase purchase5 = new Purchase("Test 5", price5, discount5, numberOfProducts5);
        Assertions.assertEquals(purchaseAmount5, purchase5.getPurchaseAmount());
        System.out.println(purchase5 + "\n");
    }
}
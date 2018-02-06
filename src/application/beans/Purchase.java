package application.beans;

public class Purchase {

    private String nameOfProduct;
    private int price;
    private int discount;
    private int numberOfProduct;
    private double purchaseAmount;
    private boolean paidWithCash;


    public Purchase(String nameOfProduct, int price, int discount,
                    int numberOfProduct, double purchaseAmount,
                    boolean paidWithCash) {

        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.discount = discount;
        this.numberOfProduct = numberOfProduct;
        this.purchaseAmount = purchaseAmount;
        this.paidWithCash = paidWithCash;

        /* nameOfProduct = "Ноутбук";
        price = 425;
        discount = 19;
        numberOfProduct = 2;
        purchaseAmount = (price*numberOfProduct) - (discount/100)*(price*numberOfProduct);*/

        System.out.println(nameOfProduct);
        System.out.println(price);
        System.out.println(discount);
        System.out.println(numberOfProduct);
        System.out.println(purchaseAmount);

    }


}

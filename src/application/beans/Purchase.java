package application.beans;

public class Purchase {

    private String nameOfProduct;
    private int price;
    private int discount;
    private int numberOfProduct;
    private double purchaseAmount;
    private boolean paidWithCash;
    private double calculatePurchaseAmount = (price - (((double) discount / 100) * price)) * numberOfProduct;

    public Purchase(String nameOfProduct, int price, int discount,
                    int numberOfProduct, boolean paidWithCash) {

        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.discount = discount;
        this.numberOfProduct = numberOfProduct;
        this.purchaseAmount = calculatePurchaseAmount;
        this.paidWithCash = paidWithCash;

    }

    @Override
    public String toString() {

        return "Наименование товара: " +  nameOfProduct + "\nЦена: " + price +
                "\nСкидка: " + discount + "\nКоличество товаров: " + numberOfProduct +
                "\nСумма товара: " + this.purchaseAmount + "\nОплачено наличными: " + paidWithCash;
    }
}

package application.beans;

public class Purchase {

    private String nameOfProduct;
    private int price;
    private int discount;
    private int numberOfProduct;
    private double purchaseAmount;

    public Purchase(String nameOfProduct, int price, int discount,
                    int numberOfProduct) {

        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.discount = discount;
        this.numberOfProduct = numberOfProduct;
        this.purchaseAmount = calculatePurchaseAmount(price, discount, numberOfProduct);
    }

    private double calculatePurchaseAmount(int price, int discount,
                                           int numberOfProduct) {

        return (price - (((double) discount / 100) * price)) * numberOfProduct;
    }

    @Override
    public String toString() {

        return "Наименование товара: " +  nameOfProduct + "\nЦена: " + price + "$" +
                "\nСкидка: " + discount + "$" + "\nКоличество товаров: " + numberOfProduct +
                "\nСумма товара: " + this.purchaseAmount + "$";
    }

    public double getPurchaseAmount() {
        return this.purchaseAmount;
    }


}

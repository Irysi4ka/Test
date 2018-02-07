package application.beans;

public class Purchase {

    private String nameOfProduct;
    private int price;
    private int discount;
    private int numberOfProduct;
    private double purchaseAmount;
    private boolean paidWithCash;

    public Purchase(String nameOfProduct, int price, int discount,
                    int numberOfProduct,
                    boolean paidWithCash) {

        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.discount = discount;
        this.numberOfProduct = numberOfProduct;
        this.purchaseAmount =  (price - (((double) discount / 100) * price)) * numberOfProduct;
        this.paidWithCash = paidWithCash;

       /* System.out.println("Наименование товара:" + nameOfProduct);
        System.out.println("Цена: " + price);
        System.out.println("Скидка: " + discount);
        System.out.println("Количество товаров: " + numberOfProduct);
        System.out.println("Сумма товара: " + purchaseAmount);
        System.out.println("Оплачено наличными: " + paidWithCash);*/
    }

    @Override
    public String toString() {

        return "Наименование товара: " +  nameOfProduct + "\nЦена: " + price +
                "\nСкидка: " + discount + "\nКоличество товаров: " + numberOfProduct +
                "\nСумма товара: " + purchaseAmount + "\nОплачено наличными: " +paidWithCash;
    }
}

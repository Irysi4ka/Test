package application;

import application.beans.Purchase;

public class Main {

    public static void main(String[] args) {

        Purchase purchase = new Purchase("Ноутбук", 425,
                19, 2, true);
        System.out.println(purchase.toString());
    }
}

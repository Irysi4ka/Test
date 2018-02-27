package application;

import application.beans.Client;
import application.beans.Purchase;

public class Main {

    public static void main(String[] args) {

        Purchase purchase = new Purchase("Ноутбук", 425,
                19, 2, true);
        Purchase purchase2 = new Purchase("Сумка", 30, 15,
                1, true);

        System.out.println(purchase.toString());
        System.out.println(purchase2.toString());

        Client client = new Client("Ирина", "Игнатенко",
                "Игоревна", 2361.2, 234);
        Client client2 = new Client("Иван", "Иванов",
                "Иванович", 1000, 700);

        System.out.println(client.toString());
        System.out.println(client2.toString());
        client.buy(purchase);
        client2.buy(purchase);

    }
}

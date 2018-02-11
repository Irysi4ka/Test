package application;

import application.beans.Client;
import application.beans.Purchase;

public class Main {

    public static void main(String[] args) {

        Purchase purchase = new Purchase("Ноутбук", 425,
                19, 2, true);

        System.out.println(purchase.toString());

        Client client = new Client("Ирина", "Игнатенко",
                "Игоревна", 2361.2, 234);

        System.out.println(client.toString());
    }
}

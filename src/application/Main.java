package application;

import application.beans.Client;
import application.beans.Purchase;

public class Main {

    public static void main(String[] args) {

        Purchase[] purchases = new Purchase[5];

        purchases[0] = new Purchase("Сумка", 425,
                19, 2);
        purchases[1] = new Purchase("Чехол", 30,
                15, 1);
        purchases[2] = new Purchase("Телефон", 900,
                15, 1);
        purchases[3] = new Purchase("Ноутбук", 480,
                15, 3);



        Client[] clients = new Client[5];
        clients[0] = new Client("Ирина", "Игнатенко",
                "Игоревна", 2361.2, 234);
        clients[1] = new Client("Иван", "Иванов",
                "Иванович", 1000, 400);
        clients[2] = new Client("Андрей", "Михайлович",
                "Кондрачук", 4000, 900);
        clients[3] = new Client("Анна", "Владимировна",
                "Семакова", 2000, 1200);

        for(int i=0; i<5; i++)
        {
            System.out.println(purchases[i] + "\n" + clients[i] + "\n");
        }

      /*  Purchase purchase = new Purchase("Сумка", 425,
                19, 2);
        Purchase purchase2 = new Purchase("Чехол", 30,
                15, 1);
        Purchase purchase3 = new Purchase("Телефон", 900,
                15, 1);
        Purchase purchase4 = new Purchase("Ноутбук", 480,
                15, 3);

        Client client = new Client("Ирина", "Игнатенко",
                "Игоревна", 2361.2, 234);
        Client client2 = new Client("Иван", "Иванов",
                "Иванович", 1000, 400);
        Client client3 = new Client("Андрей", "Михайлович",
                "Кондрачук", 4000, 900);
        Client client4 = new Client("Анна", "Владимировна",
                "Семакова", 2000, 1200);*/

      /*  System.out.println("\n" + purchase.toString());
        System.out.println(client.toString());
        client.buy(purchase);

        System.out.println("\n" + purchase2.toString());
        System.out.println(client2.toString());
        client2.buy(purchase2);

        System.out.println("\n" + purchase3.toString());
        System.out.println(client3.toString());
        client3.buy(purchase3);

        System.out.println("\n" + purchase4.toString());
        System.out.println(client4.toString());
        client4.buy(purchase4);*/

    }
}

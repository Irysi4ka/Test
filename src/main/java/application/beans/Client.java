package application.beans;

public class Client {

    private String name;
    private String surname;
    private String middleName;
    private double moneyOnTheBankAccount;
    private double cash;
    private Purchase[] purchases;

    public Client(String name, String surname, String middleName,
                  double moneyOnTheBankAccount, double cash) {

        this.surname = surname;
        this.middleName = middleName;
        this.name = fulName(name, surname, middleName);
        this.moneyOnTheBankAccount = moneyOnTheBankAccount;
        this.cash = cash;

    }

    private String fulName(String name, String surname, String middleName){
        return name + " " + surname + " " + middleName;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + "\nДеньги на счету в банке: " +
                this.moneyOnTheBankAccount + "$" + "\nНаличные: " + this.cash + "$";
    }

    public double getCash() {
        return cash;
    }

    public double getMoneyOnTheBankAccount() {
        return moneyOnTheBankAccount;
    }


    public void buy(Purchase purchase) {
        if (getCash() >= purchase.getPurchaseAmount()) {
            this.cash -= purchase.getPurchaseAmount();
            System.out.println("Остаток наличных: " + this.cash + "$" );
            this.addPurchase(purchase);
        }else if (getMoneyOnTheBankAccount() >= purchase.getPurchaseAmount()){
            this.moneyOnTheBankAccount -= purchase.getPurchaseAmount();
            System.out.println("Сумма списана со счета в банке: " + purchase.getPurchaseAmount() + "$");
            this.addPurchase(purchase);
        }else {
            System.out.println("Недостаточно средств на счету в банке" + "\nВаш остаток на счету составляет: " +  this.moneyOnTheBankAccount);
        }
    }

    private void addPurchase(Purchase purchase) {
        if (purchases == null) {
            purchases = new Purchase[1];
            purchases[0] = purchase;
            System.out.println("+1 товар: " + purchase);
            System.out.println("Наличные: " + this.cash + "$" );
            if (getCash() >= purchase.getPurchaseAmount()) {
                this.cash -= purchase.getPurchaseAmount();
                System.out.println("Остаток наличных: " + this.cash + "$" );
        } else {
            Purchase[] purchases = new Purchase[this.purchases.length + 1];
            for (int i = 0; i < this.purchases.length; i++) {
                purchases[i] = this.purchases[i];
            }
                if (getMoneyOnTheBankAccount() >= purchase.getPurchaseAmount()){
                    this.moneyOnTheBankAccount -= purchase.getPurchaseAmount();
                }
            purchases[purchases.length - 1] = purchase;
            System.out.println("Сумма списана со счета в банке: " + purchase.getPurchaseAmount() + "$");
            System.out.println("Ваш остаток на счету составляет: " + this.moneyOnTheBankAccount + " $");
            }
        }
    }

}
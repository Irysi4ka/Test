package application.beans;

public class Client {

    private String name;
    private String surname;
    private String middleName;
    private double moneyOnTheBankAccount;
    private double cash;
    private Purchase[] purchases;

    public Client(String name, String surname, String middleName,
                  double moneyOnTheBankAccount, double cash, Purchase[] purchases) {

        this.surname = surname;
        this.middleName = middleName;
        this.name = fulName(name, surname, middleName);
        this.moneyOnTheBankAccount = moneyOnTheBankAccount;
        this.cash = cash;
        this.purchases = purchases;

    }

    private String fulName(String name, String surname, String middleName){
        return name + " " + surname + " " + middleName;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + "\nДеньги на счету в банке: " +
                this.moneyOnTheBankAccount + "$" + "\nНаличные: " + this.cash + "$";
    }

    public void buy(Purchase purchase) {
        if (this.cash >= purchase.getPurchaseAmount()) {
            this.cash -= purchase.getPurchaseAmount();
            this.purchases.add(purchase);
            System.out.println("Остаток наличных: " + this.cash + "$");
        }else if (this.moneyOnTheBankAccount >= purchase.getPurchaseAmount()){
            this.moneyOnTheBankAccount -= purchase.getPurchaseAmount();
            this.purchases.add(purchase);
            System.out.println("Сумма списана со счета в банке: " + purchase.getPurchaseAmount() + "$");
        }else {
            System.out.println("Недостаточно средств на счету в банке" + "\nВаш остаток на счету составляет: " +  this.moneyOnTheBankAccount);
        }

    }
}
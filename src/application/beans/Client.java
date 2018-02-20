package application.beans;

public class Client {

    private String name;
    private String surname;
    private String middleName;
    private double moneyOnTheBankAccount;
    private double cash;

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

    public void buy(Purchase purchase){
        if (this.moneyOnTheBankAccount > purchase.getPurchaseAmount()){
            if (this.cash >= purchase.getPurchaseAmount()){
                System.out.println("Остаток наличных: " +
                        (this.cash - purchase.getPurchaseAmount()) + "$");
            }else{
                System.out.println("Остаток на счету в банке: " +
                        (this.moneyOnTheBankAccount - purchase.getPurchaseAmount()) + "$");
            }
        }else {
            System.out.println("Недостаточно средств на счету в банке");
        }

     /*   if (purchase.isPaidWithCash()){

        }*/

    }

}

package rvt;

public class Paymentcard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        String money = String.valueOf(balance);
        System.out.println("The card has a balance of " + money + " euros.");
        return money;
    }

    public void eatAffordably() {
        if (balance > 2.60) {
            balance = balance - 2.60;
        } else {
            ;
        }
    }

    public void eatHeartily() {
        if (balance > 4.60) {
            balance = balance - 4.60;
        } else {
            ;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            ;
        } else {
            balance += amount;
        }
    }
    public static void main(String[] args) {
    PaymentCard paulsCard = new PaymentCard(25);
    PaymentCard mattsCard = new PaymentCard(40);

    paulsCard.eatHeartily();
    mattsCard.eatAffordably();
    System.out.println("Pauls: " + paulsCard);
    System.out.println("Matts: " + mattsCard);

    paulsCard.addMoney(30);
    mattsCard.eatHeartily();
    System.out.println("Pauls: " + paulsCard);
    System.out.println("Matts: " + mattsCard);

    paulsCard.eatAffordably();
    paulsCard.eatAffordably();
    mattsCard.addMoney(60);
    System.out.println("Pauls: " + paulsCard);
    System.out.println("Matts: " + mattsCard);
}
}



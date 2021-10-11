
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        this.balance = this.balance - amount;
        
        if (this.balance  < 0){
            this.balance = this.balance + amount;
            return false;
        }else{
            return true;
        }
        
    }
}

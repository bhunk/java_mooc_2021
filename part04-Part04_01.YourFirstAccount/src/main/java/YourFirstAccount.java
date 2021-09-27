
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account BobAcc = new Account("Bob", 100.00);

        System.out.println("Initial state");
        System.out.println(BobAcc);

        BobAcc.deposit(20.00);
        System.out.println("The balance of Bob's account is now: " + (BobAcc));

        System.out.println("End state");
        System.out.println(BobAcc);
        
    }
}

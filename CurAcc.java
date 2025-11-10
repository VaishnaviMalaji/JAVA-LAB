// Current Account class
class CurAcct extends Account {
    double minBalance = 1000;
    double serviceCharge = 100;

    void checkMinBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Balance below minimum! ₹" + serviceCharge + " service charge imposed.");
        }
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
            checkMinBalance();
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

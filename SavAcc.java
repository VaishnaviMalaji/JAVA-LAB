// Savings Account class
class SavAcct extends Account {
    double interestRate = 0.05; // 5% annual interest

    void computeAndDepositInterest() {
        double interest = balance * Math.pow((1 + interestRate / 12), 12) - balance;
        balance += interest;
        System.out.printf("Interest of RS.%.2f added successfully!\n", interest);
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
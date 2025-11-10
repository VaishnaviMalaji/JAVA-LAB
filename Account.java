import java.util.Scanner;

// Base class
class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Scanner sc = new Scanner(System.in);

    void inputDetails() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Account Type (Savings/Current): ");
        accountType = sc.nextLine();
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        balance += amt;
        System.out.println("Amount deposited successfully!");
    }

    void displayBalance() {
        System.out.println("\nAccount Holder: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: RS." + balance);
    }
}


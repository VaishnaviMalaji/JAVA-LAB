import java.util.Scanner;
// Main class
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== BANK ACCOUNT MANAGEMENT ====");
        System.out.print("Enter account type (1 for Savings, 2 for Current): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            SavAcct s = new SavAcct();
            s.inputDetails();
            s.deposit();
            s.computeAndDepositInterest();
            s.withdraw();
            s.displayBalance();
        } else if (choice == 2) {
            CurAcct c = new CurAcct();
            c.inputDetails();
            c.deposit();
            c.withdraw();
            c.displayBalance();
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

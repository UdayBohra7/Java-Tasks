import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount +" Rs");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " Rs");
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient balance.");
        }
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount bankAccount) {
        account = bankAccount;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Select your options from below:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice(from: 1/2/3/4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance()+" Rs");
                    break;
                case 4:
                    System.out.println("Thank you for using our service! if you want to use our service again please run this program again!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 4);
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(50000.0); // Initial balance
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
import java.util.*;

// class for bank account
class  AtmInterace{
    private double balance;
    private int accountNumber;
    public AtmInterace(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        balance = initialBalance;
    }
    // method for deposit
    void deposit(double amount) {
        balance += amount;
        System.out.println("Transaction successful");
        System.out.println("The amount Rs" + amount + " is deposited in account no :" + accountNumber);
    }
    // method for withdraw
    void withdraw(double amount) {
        if (amount > balance || amount == (double) 0) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Transaction successful");
            System.out.println("The amount Rs" + amount + " is debicted from account no :" + accountNumber);
        }
    }
    // method for checking balance
    void checkBalance() {
        System.out.println("Your account balance is Rs" + balance);
    }
}
// class for ATM
class ATM {
    private AtmInterace acc;
    public ATM(AtmInterace ba) {
        acc = ba;
    }
    void displayMenu() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Please select an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    acc.withdraw(withdrawAmount);
                    System.out.print("Do you want to check balance(y/n) : ");
                    String ch=sc.next().toLowerCase();
                    if(ch.equals("y")){
                        acc.checkBalance();
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount  to deposite : ");
                    double depAmount = sc.nextInt();
                    acc.deposit(depAmount);
                    System.out.print("Do you want to check balance(y/n) : ");
                    String ch1=sc.next().toLowerCase();
                    if(ch1.equals("y")){
                        acc.checkBalance();
                    }
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class Task_3 {
    public  static void main(String arg[]){
        AtmInterace ba=new AtmInterace(9875432, 8000);
        ATM atm=new ATM(ba);
        atm.run();
    }
}
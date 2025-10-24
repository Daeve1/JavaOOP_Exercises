
class BankAccount {
  
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

   
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₱" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₱" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

   
    public void checkBalance() {
        System.out.println("Current Balance: ₱" + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

   
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: ₱" + interest);
        System.out.println("New Balance: ₱" + balance);
    }
}


public class BankAccMain {
    public static void main(String[] args) {
      
        SavingsAccount account = new SavingsAccount("2025-001", "Dave Lavega", 100000.0, 3.5);

        System.out.println("=== Bank Account Details ===");
        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Account Number: " + account.accountNumber);

        account.checkBalance();
        account.deposit(1500.0);
        account.withdraw(1000.0);
        account.checkBalance();

        System.out.println("\nApplying Interest...");
        account.applyInterest();

        account.checkBalance();
    }
}

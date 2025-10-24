import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

  
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

   
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully into " + accountHolder + "'s account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully from " + accountHolder + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}

public class BankMain {
    private ArrayList<Account> accounts = new ArrayList<>();

   
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added for " + account.getAccountHolder());
    }

    
    public void removeAccount(String accountNumber) {
        boolean removed = false;
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                accounts.remove(acc);
                System.out.println("Account " + accountNumber + " removed successfully.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    
    public void deposit(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    
    public void withdraw(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    public void displayAllAccounts() {
        System.out.println("\nAll Bank Accounts:");
        for (Account acc : accounts) {
            acc.displayAccount();
        }
    }

   
    public static void main(String[] args) {
        BankMain bank = new BankMain();

        
        Account a1 = new Account("1001", "Dave", 5000);
        Account a2 = new Account("1002", "Cyrel", 3000);

       
        bank.addAccount(a1);
        bank.addAccount(a2);

       
        bank.displayAllAccounts();

        
        bank.deposit("1001", 2000);
        bank.withdraw("1002", 1000);

        
        bank.displayAllAccounts();

        
        bank.removeAccount("1002");

        
        bank.displayAllAccounts();
    }
}


class Customer {
    protected String name;
    protected String email;
    protected double[] purchaseHistory;
    protected int purchaseCount;

    
    public Customer(String name, String email, int maxPurchases) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new double[maxPurchases];
        this.purchaseCount = 0;
    }

   
    public void addPurchase(double amount) {
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount++] = amount;
            System.out.println("Added purchase: ₱" + amount);
        } else {
            System.out.println("Purchase history is full!");
        }
    }

    
    public double calculateTotalExpenditure() {
        double total = 0;
        for (int i = 0; i < purchaseCount; i++) {
            total += purchaseHistory[i];
        }
        return total;
    }

    
    public void displayCustomerInfo() {
        System.out.println("\n=== Customer Information ===");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Total Expenditure: ₱" + calculateTotalExpenditure());
    }
}


class LoyalCustomer extends Customer {
    private double discountRate; 

   
    public LoyalCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }

    
    public double applyDiscount() {
        double total = calculateTotalExpenditure();
        double discountAmount = total * (discountRate / 100);
        double discountedTotal = total - discountAmount;
        System.out.println("Discount applied (" + discountRate + "%): ₱" + discountAmount);
        System.out.println("Total after discount: ₱" + discountedTotal);
        return discountedTotal;
    }

    
    @Override
    public void displayCustomerInfo() {
        super.displayCustomerInfo();
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}


public class CustomerMain {
    public static void main(String[] args) {
        Customer regular = new Customer("Odette", "Odette@email.com", 5);
        regular.addPurchase(10000);
        regular.addPurchase(500);
        regular.displayCustomerInfo();

        LoyalCustomer loyal = new LoyalCustomer("Nana", "Nana@email.com", 5, 10.0);
        loyal.addPurchase(2000);
        loyal.addPurchase(1500);
        loyal.displayCustomerInfo();
        loyal.applyDiscount();
    }
}

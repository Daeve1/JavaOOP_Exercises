
class ElectronicsProduct {
    protected String productID;
    protected String name;
    protected double price;

    public ElectronicsProduct(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

   
    public double applyDiscount(double discountPercent) {
        double discountAmount = price * (discountPercent / 100);
        double finalPrice = price - discountAmount;
        System.out.println("Discount applied: " + discountPercent + "%");
        System.out.println("Discount amount: ₱" + discountAmount);
        return finalPrice;
    }

    
    public void displayProductInfo() {
        System.out.println("\n=== Product Information ===");
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: ₱" + price);
    }
}


class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod; 

    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    
    public void extendWarranty(int extraYears) {
        warrantyPeriod += extraYears;
        System.out.println("Warranty extended by " + extraYears + " years.");
        System.out.println("New total warranty: " + warrantyPeriod + " years.");
    }

   
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}


public class ElectronicMain {
    public static void main(String[] args) {
        ElectronicsProduct product = new ElectronicsProduct("EP001", "Smart TV", 25000);
        product.displayProductInfo();
        double discountedPrice = product.applyDiscount(10);
        System.out.println("Final Price after discount: ₱" + discountedPrice);

        WashingMachine washer = new WashingMachine("WM100", "Samsung Front Load", 35000, 2);
        washer.displayProductInfo();
        double finalWasherPrice = washer.applyDiscount(15);
        System.out.println("Final Price after discount: ₱" + finalWasherPrice);
        washer.extendWarranty(1);
    }
}

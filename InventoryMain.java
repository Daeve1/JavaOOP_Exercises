public class InventoryMain {
    
    static class Product {
        private String name;
        private int quantity;

      
        public Product(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

     
        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

     
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

   
    private Product[] products;
    private int count;

    
    public InventoryMain(int size) {
        products = new Product[size];
        count = 0;
    }

   
    public void addProduct(String name, int quantity) {
        if (count < products.length) {
            products[count++] = new Product(name, quantity);
            System.out.println("Product added: " + name);
        } else {
            System.out.println("Inventory is full! Cannot add more products.");
        }
    }

   
    public void removeProduct(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
              
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[count - 1] = null;
                count--;
                found = true;
                System.out.println("Product removed: " + name);
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found: " + name);
        }
    }

 
    public void checkLowInventory(int threshold) {
        System.out.println("\nLow Inventory Products (below " + threshold + "):");
        boolean anyLow = false;
        for (int i = 0; i < count; i++) {
            if (products[i].getQuantity() < threshold) {
                System.out.println("- " + products[i].getName() + ": " + products[i].getQuantity());
                anyLow = true;
            }
        }
        if (!anyLow) {
            System.out.println("No products with low inventory.");
        }
    }

  
    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + products[i].getName() + ": " + products[i].getQuantity());
        }
    }


    public static void main(String[] args) {
        InventoryMain inventory = new InventoryMain(5);

        inventory.addProduct("Apples", 10);
        inventory.addProduct("Bananas", 10);
        inventory.addProduct("Oranges", 5);

        inventory.displayInventory();

        inventory.checkLowInventory(15);

        inventory.removeProduct("Bananas");
        inventory.displayInventory();
    }
}

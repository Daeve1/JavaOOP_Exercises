public class RestaurantMain {
   
    private String[] menuItems;
    private double[] prices;
    private double[] ratings;
    private int itemCount;

  
    public RestaurantMain(int size) {
        menuItems = new String[size];
        prices = new double[size];
        ratings = new double[size];
        itemCount = 0;
    }

   
    public void addItem(String name, double price, double rating) {
        if (itemCount < menuItems.length) {
            menuItems[itemCount] = name;
            prices[itemCount] = price;
            ratings[itemCount] = rating;
            itemCount++;
            System.out.println("Item added: " + name + " | Price: ₱" + price + " | Rating: " + rating);
        } else {
            System.out.println("Menu is full! Cannot add more items.");
        }
    }

   
    public void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (menuItems[i].equalsIgnoreCase(name)) {
                for (int j = i; j < itemCount - 1; j++) {
                    menuItems[j] = menuItems[j + 1];
                    prices[j] = prices[j + 1];
                    ratings[j] = ratings[j + 1];
                }
                itemCount--;
                found = true;
                System.out.println("Item removed: " + name);
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found: " + name);
        }
    }

    
    public double calculateAverageRating() {
        if (itemCount == 0) {
            return 0.0;
        }
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += ratings[i];
        }
        return total / itemCount;
    }

    public void displayMenu() {
        System.out.println("\n--- Restaurant Menu ---");
        if (itemCount == 0) {
            System.out.println("No items on the menu.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println((i + 1) + ". " + menuItems[i] + " - ₱" + prices[i] + " (Rating: " + ratings[i] + ")");
            }
        }
    }

 
    public static void main(String[] args) {
        RestaurantMain restaurant = new RestaurantMain(5);

        restaurant.addItem("Burger", 150.0, 4.5);
        restaurant.addItem("Fries", 80.0, 4.2);
        restaurant.addItem("Pizza", 300.0, 4.8);

        restaurant.displayMenu();

        System.out.println("\nAverage Rating: " + restaurant.calculateAverageRating());

        restaurant.removeItem("Fries");
        restaurant.displayMenu();

        System.out.println("\nAverage Rating after removal: " + restaurant.calculateAverageRating());
    }
}

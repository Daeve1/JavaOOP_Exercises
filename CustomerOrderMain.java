
class CustomerOrder {
    protected String orderID;
    protected String customer;
    protected String orderDate;

    
    public CustomerOrder(String orderID, String customer, String orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    
    public void displayOrderDetails() {
        System.out.println("\n=== Order Details ===");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }
}


class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;
    private String trackingStatus;

    
    public OnlineOrder(String orderID, String customer, String orderDate, String deliveryAddress, String trackingNumber) {
        super(orderID, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Processing"; 
    }

   
    public int calculateDeliveryTime() {
        if (deliveryAddress.toLowerCase().contains("manila")) {
            return 2; 
        } else if (deliveryAddress.toLowerCase().contains("luzon")) {
            return 4; 
        } else if (deliveryAddress.toLowerCase().contains("visayas")) {
            return 6; 
        } else if (deliveryAddress.toLowerCase().contains("mindanao")) {
            return 7; 
        } else {
            return 10; 
        }
    }

   
    public void updateTrackingStatus(String newStatus) {
        trackingStatus = newStatus;
        System.out.println("Tracking status updated to: " + trackingStatus);
    }

   
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Tracking Status: " + trackingStatus);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime() + " days");
    }
}


public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order1 = new OnlineOrder(
                "ORD12345", 
                "Juan Dela Cruz", 
                "2025-10-23", 
                "Makati City, Manila", 
                "TRK98765"
        );

        order1.displayOrderDetails();

        System.out.println("\n--- Updating Tracking Status ---");
        order1.updateTrackingStatus("Shipped");
        order1.updateTrackingStatus("Out for Delivery");
        order1.updateTrackingStatus("Delivered");

        System.out.println("\n--- Final Order Details ---");
        order1.displayOrderDetails();
    }
}

public class TravelBookingMain {
    
    private String bookedFlight;
    private String bookedHotel;

  
    public TravelBookingMain() {
        bookedFlight = null;
        bookedHotel = null;
    }

    
    public void searchFlights(String destination) {
        System.out.println("\n--- Searching Flights to " + destination + " ---");
        System.out.println("1. Flight PR123 - 8:00 AM");
        System.out.println("2. Flight PR456 - 2:00 PM");
        System.out.println("3. Flight PR789 - 8:00 PM");
    }

   
    public void searchHotels(String location) {
        System.out.println("\n--- Searching Hotels in " + location + " ---");
        System.out.println("1. Grand Palace Hotel - ₱5,000/night");
        System.out.println("2. City Inn - ₱2,500/night");
        System.out.println("3. Beach Resort - ₱4,000/night");
    }

    
    public void bookFlight(String flightNumber) {
        bookedFlight = flightNumber;
        System.out.println("✅ Flight booked successfully: " + flightNumber);
    }

  
    public void bookHotel(String hotelName) {
        bookedHotel = hotelName;
        System.out.println("✅ Hotel booked successfully: " + hotelName);
    }

   
    public void cancelFlight() {
        if (bookedFlight != null) {
            System.out.println("❌ Flight reservation canceled: " + bookedFlight);
            bookedFlight = null;
        } else {
            System.out.println("No flight reservation to cancel.");
        }
    }

   
    public void cancelHotel() {
        if (bookedHotel != null) {
            System.out.println("❌ Hotel reservation canceled: " + bookedHotel);
            bookedHotel = null;
        } else {
            System.out.println("No hotel reservation to cancel.");
        }
    }

   
    public void displayBookings() {
        System.out.println("\n--- Current Reservations ---");
        if (bookedFlight != null)
            System.out.println("Flight: " + bookedFlight);
        else
            System.out.println("No flight booked.");

        if (bookedHotel != null)
            System.out.println("Hotel: " + bookedHotel);
        else
            System.out.println("No hotel booked.");
    }

  
    public static void main(String[] args) {
        TravelBookingMain bookingSystem = new TravelBookingMain();

        bookingSystem.searchFlights("Tokyo");
        bookingSystem.searchHotels("Tokyo");

        bookingSystem.bookFlight("PR123");
        bookingSystem.bookHotel("Grand Palace Hotel");

        bookingSystem.displayBookings();

        bookingSystem.cancelFlight();
        bookingSystem.cancelHotel();

        bookingSystem.displayBookings();
    }
}

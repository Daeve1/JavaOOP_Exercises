public class AirplaneMain {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;

    
    public AirplaneMain(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false; 
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

  
    public void checkFlightStatus() {
        if (delayed) {
            System.out.println("Flight " + flightNumber + " is delayed.");
        } else {
            System.out.println("Flight " + flightNumber + " is on time.");
        }
    }

   
    public void delayFlight(String newDepartureTime) {
        this.departureTime = newDepartureTime;
        this.delayed = true;
        System.out.println("Flight " + flightNumber + " has been delayed to " + departureTime);
    }

       public static void main(String[] args) {
        AirplaneMain flight1 = new AirplaneMain("PR123", "MANILA", "10:30 AM");

       
        flight1.checkFlightStatus();

      
        flight1.delayFlight("12:00 PM");

       
        flight1.checkFlightStatus();
    }
}

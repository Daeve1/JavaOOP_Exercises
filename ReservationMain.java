
class Reservation {
    protected String reservationID;
    protected String customerName;
    protected String date;
    protected String status;

    
    public Reservation(String reservationID, String customerName, String date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
        this.status = "Pending"; 
    }

    
    public void displayReservationDetails() {
        System.out.println("\n=== Reservation Details ===");
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
    }

   
    public void checkStatus() {
        System.out.println("Current reservation status: " + status);
    }

    
    public void modifyDate(String newDate) {
        this.date = newDate;
        System.out.println("Reservation date updated to: " + date);
    }

  
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Status changed to: " + status);
    }
}


class ResortReservation extends Reservation {
    private int roomNumber;

   
    public ResortReservation(String reservationID, String customerName, String date, int roomNumber) {
        super(reservationID, customerName, date);
        this.roomNumber = roomNumber;
    }

   
    public void modifyRoom(int newRoomNumber) {
        this.roomNumber = newRoomNumber;
        System.out.println("Room number updated to: " + roomNumber);
    }

    @Override
    public void displayReservationDetails() {
        super.displayReservationDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}


class RailwayReservation extends Reservation {
    private String seatNumber;

  
    public RailwayReservation(String reservationID, String customerName, String date, String seatNumber) {
        super(reservationID, customerName, date);
        this.seatNumber = seatNumber;
    }

   
    public void modifySeat(String newSeatNumber) {
        this.seatNumber = newSeatNumber;
        System.out.println("Seat number updated to: " + seatNumber);
    }

    @Override
    public void displayReservationDetails() {
        super.displayReservationDetails();
        System.out.println("Seat Number: " + seatNumber);
    }
}


public class ReservationMain {
    public static void main(String[] args) {
      
        ResortReservation resortRes = new ResortReservation("RES1001", "Kimmy", "2025-11-05", 204);
        resortRes.displayReservationDetails();
        resortRes.updateStatus("Confirmed");
        resortRes.modifyRoom(305);
        resortRes.modifyDate("2025-11-06");
        resortRes.checkStatus();

       
        RailwayReservation railRes = new RailwayReservation("RAIL2001", "Aldous", "2025-12-01", "B12");
        railRes.displayReservationDetails();
        railRes.updateStatus("Cancelled");
        railRes.modifySeat("C15");
        railRes.modifyDate("2025-12-02");
        railRes.checkStatus();
    }
}


class Event {
    protected String eventName;
    protected String date;     
    protected String location;

    
    public Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

   
    public void displayEventDetails() {
        System.out.println("\n=== Event Details ===");
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    
    public boolean hasConflict(Event otherEvent) {
        return this.date.equals(otherEvent.date) && this.location.equalsIgnoreCase(otherEvent.location);
    }
}


class Seminar extends Event {
    private int numberOfSpeakers;

    
    public Seminar(String eventName, String date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}


class MusicalPerformance extends Event {
    private String[] performers;

   
    public MusicalPerformance(String eventName, String date, String location, String[] performers) {
        super(eventName, date, location);
        this.performers = performers;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.print("Performers: ");
        for (int i = 0; i < performers.length; i++) {
            System.out.print(performers[i]);
            if (i < performers.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}


public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("Tech Innovation Summit", "2025-11-10", "Manila Convention Center", 5);
        MusicalPerformance concert = new MusicalPerformance("RockFest 2025", "2025-11-10", "Manila Convention Center",
                new String[]{"The Rockers", "Echo Band", "DJ Vibe"});

       
        seminar.displayEventDetails();
        concert.displayEventDetails();

        
        System.out.println("\n=== Schedule Check ===");
        if (seminar.hasConflict(concert)) {
            System.out.println("⚠️ Conflict detected: Both events are on the same date and location!");
        } else {
            System.out.println("✅ No conflict detected between the events.");
        }
    }
}

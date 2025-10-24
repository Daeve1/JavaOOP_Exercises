
class GymMembership {
    protected String memberName;
    protected String membershipType; 
    protected int duration; 
  
    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

   
    public double calculateFee() {
        double monthlyRate;

        switch (membershipType.toLowerCase()) {
            case "standard":
                monthlyRate = 1000;
                break;
            case "premium":
                monthlyRate = 1500;
                break;
            default:
                monthlyRate = 700; 
        }

        return monthlyRate * duration;
    }

  
    public void checkSpecialOffer() {
        if (duration >= 12) {
            System.out.println("🎉 Special Offer: 1 month free for yearly membership!");
        } else {
            System.out.println("No special offers available for this plan.");
        }
    }

    
    public void displayDetails() {
        System.out.println("\n=== Gym Membership Details ===");
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fee: ₱" + calculateFee());
        checkSpecialOffer();
    }
}


class PremiumMembership extends GymMembership {
    private boolean hasPersonalTrainer;
    private boolean hasSpaAccess;

  
    public PremiumMembership(String memberName, int duration, boolean hasPersonalTrainer, boolean hasSpaAccess) {
        super(memberName, "Premium", duration);
        this.hasPersonalTrainer = hasPersonalTrainer;
        this.hasSpaAccess = hasSpaAccess;
    }

  
    @Override
    public double calculateFee() {
        double baseFee = super.calculateFee();
        if (hasPersonalTrainer) {
            baseFee += 500 * duration; 
        }
        if (hasSpaAccess) {
            baseFee += 300 * duration; 
        }
        return baseFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer: " + (hasPersonalTrainer ? "Yes" : "No"));
        System.out.println("Spa Access: " + (hasSpaAccess ? "Yes" : "No"));
    }
}


public class GymMain {
    public static void main(String[] args) {
        GymMembership basic = new GymMembership("Khaleed", "Basic", 6);
        PremiumMembership premium = new PremiumMembership("Eudora", 12, true, true);

        basic.displayDetails();
        premium.displayDetails();
    }
}

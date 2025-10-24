
class Building {
    protected String address;
    protected int numberOfFloors;
    protected double totalArea;

    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

 
    public void displayBuildingInfo() {
        System.out.println("\n=== Building Information ===");
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sqm");
    }
}


class ResidentialBuilding extends Building {
    private int numberOfApartments;
    private double rentPerApartment; 

    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

   
    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    @Override
    public void displayBuildingInfo() {
        super.displayBuildingInfo();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: ₱" + rentPerApartment);
        System.out.println("Total Monthly Rent: ₱" + calculateTotalRent());
    }
}


class CommercialBuilding extends Building {
    private double officeSpace; 
    private double rentPerSqm;  


    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpace, double rentPerSqm) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSqm = rentPerSqm;
    }

   
    public double calculateTotalRent() {
        return officeSpace * rentPerSqm;
    }

    @Override
    public void displayBuildingInfo() {
        super.displayBuildingInfo();
        System.out.println("Office Space: " + officeSpace + " sqm");
        System.out.println("Rent per sqm: ₱" + rentPerSqm);
        System.out.println("Total Monthly Rent: ₱" + calculateTotalRent());
    }
}


public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding resBuilding = new ResidentialBuilding(
                "123 Palm Street", 5, 1200.5, 20, 15000);
        resBuilding.displayBuildingInfo();

        CommercialBuilding comBuilding = new CommercialBuilding(
                "456 Business Ave", 10, 5000.0, 3000.0, 800);
        comBuilding.displayBuildingInfo();
    }
}

public class CircleMain {
    private double radius;

  
    public CircleMain(double radius) {
        this.radius = radius;
    }

   
    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

  
    public double calculateArea() {
        return 3.1416 * radius * radius; 
    }

  
    public double calculateCircumference() {
        return 2 * 3.1416 * radius;
    }

  
    public static void main(String[] args) {
        CircleMain circle = new CircleMain(5.0);

        System.out.println("Initial Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

       
        circle.setRadius(7.5);
        System.out.println("\nUpdated Radius: " + circle.getRadius());
        System.out.println("New Area: " + circle.calculateArea());
        System.out.println("New Circumference: " + circle.calculateCircumference());
    }
}

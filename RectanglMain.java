
public class RectanglMain {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(69, 69);

       
        System.out.println("Rectangle Details:");
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}


class Rectangle {
    
    private double width;
    private double height;

    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

  
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }

    
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

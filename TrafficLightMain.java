public class TrafficLightMain {
    
    private String color;
    private int duration; 

   
    public TrafficLightMain(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

   
    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

   
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light changed to " + color + " for " + duration + " seconds.");
    }

   
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

   
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

   
    public void displayLightStatus() {
        System.out.println("Current Light: " + color);
        System.out.println("Duration: " + duration + " seconds");
        if (isRed()) {
            System.out.println("Stop! The light is red.");
        } else if (isGreen()) {
            System.out.println("Go! The light is green.");
        } else {
            System.out.println("Prepare to move! The light is yellow.");
        }
        System.out.println("-----------------------------");
    }


    public static void main(String[] args) {
       
        TrafficLightMain light = new TrafficLightMain("Red", 30);

       
        light.displayLightStatus();

        light.changeColor("Yellow", 5);
        light.displayLightStatus();

        
        light.changeColor("Green", 25);
        light.displayLightStatus();
    }
}

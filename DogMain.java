
public class DogMain {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Buddy", "Aspin");
        Dog dog2 = new Dog("Blackey", "Bulldog");

        
        System.out.println("Initial Values:");
        System.out.println("Dog 1: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + ", Breed: " + dog2.getBreed());

      
        dog1.setName("Brownie");
        dog1.setBreed("Labrador");

        dog2.setName("Whitey");
        dog2.setBreed("German Shepherd");

        
        System.out.println("\nAfter the update:");
        System.out.println("Dog 1: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}


class Dog {
    
    private String name;
    private String breed;

   
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

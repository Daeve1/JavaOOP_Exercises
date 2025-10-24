
class Pet {
    String name;
    String species;
    int age;

   
    Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

   
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    
    int getHumanYears() {
        return age * 7;
    }
}


class Dog extends Pet {
    String favoriteToy;

    Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }

    @Override
    int getHumanYears() {
        return age * 7; 
    }
}


class Bird extends Pet {
    double wingspan;

    Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan: " + wingspan + " cm");
    }

    @Override
    int getHumanYears() {
        return age * 5;
    }
}


public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 4, "Rubber Ball");
        Bird bird = new Bird("Kiwi", 2, 25.5);

        System.out.println("=== Dog Details ===");
        dog.displayDetails();
        System.out.println("Age in Human Years: " + dog.getHumanYears());

        System.out.println("\n=== Bird Details ===");
        bird.displayDetails();
        System.out.println("Age in Human Years: " + bird.getHumanYears());
    }
}

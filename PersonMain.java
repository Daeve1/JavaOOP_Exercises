
public class PersonMain {
    public static void main(String[] args) {
        
        Person person1 = new Person("Dave", 18);
        Person person2 = new Person("Cyrel", 19);

       
        System.out.println("Person 1: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", Age: " + person2.getAge());
    }
}


class Person {
    
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


package rabbits;

public class Rabbit {
    String name;
    int age;
    String colour;

    // Constructor
    public Rabbit(String n, int a, String c) {
        this.name = n;
        this.age = a;
        this.colour = c;
    }

    // Methods
    void increaseAge() {
        age = age + 1;
    }

    public int getAge() {
        return age;
    }

    // Demo 4.04 - The toString Method
    public String toString() {
        return "Name: " + name + "; Age: " + age + "; Colour: " + colour;
    }

}

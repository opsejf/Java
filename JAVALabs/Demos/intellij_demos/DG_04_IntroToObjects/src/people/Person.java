package people;

public class Person {
    // Demo 4.06 - Encapsulation
    private String name;
    private int age;


    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    /**
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}

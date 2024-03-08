package people;

public class PersonMain {
    public static void main(String[] args) {
        // Demo 4.07 - Using Encapsulation

        Person person = new Person("Frederick", 22);
        System.out.println(person);

        person.setName("Freddie");
        person.setAge(23);

        System.out.println("person's name is: " + person.getName() +
                ", age is " + person.getAge());

        //System.out.println(person.name);
    }

}

package qa;

public class A_BasicStringHandling {
    public static void main(String[] args) {
        String hello = "Hello ";
        String world = "World";

        String greeting = hello + world;
        System.out.println(greeting);

        String start = "My age is ";
        int age = 21;

        String complete = start + age;
        System.out.println(complete);

        System.out.println(hello.equals(world));

        String world2 = "world";
        System.out.println(world.equalsIgnoreCase(world2));
    }

}

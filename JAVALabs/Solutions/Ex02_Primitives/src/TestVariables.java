public class TestVariables {
    public static void main(String[] args) {
        //2-1
        String name;
        int age;

        //2-2
        name = "Alice";
        age = 21;

        //2-3
        System.out.println(name);
        System.out.println(age);

        //2-5
        System.out.println(name + "'s age is " + age);

        //2-6
        name = "Barak";
        age = 100;
        System.out.println(name + "'s age is " + age);

        //3-1
        int m = 1;
        double x = 0.5;
        int c = 15;

        //3-2
        double y;

        //3-3
        y = m * x + c;

        System.out.println("Equation Result");
        System.out.println(m + " * " + x + " + " + c + " = " + y);

        //4-1
        boolean isRaining = true;
        //4-2
        boolean happy = true;

        //4-3 - using and
        System.out.println(isRaining && happy);
        System.out.println(isRaining && !happy);
        System.out.println(!isRaining && happy);
        System.out.println(!isRaining && !happy);

        //4-5 - using or
        System.out.println(isRaining || happy);
        System.out.println(isRaining || !happy);
        System.out.println(!isRaining || happy);
        System.out.println(!isRaining || !happy);


    }
}

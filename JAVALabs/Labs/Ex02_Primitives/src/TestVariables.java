public class TestVariables {

    public static void main(String[] args) {

        //task2
//        String name = "Jane";
//        int age = 17;
//
//        System.out.println(name);
//        System.out.println(age);
//
//        System.out.println(name + "'s age is " + age);

        //task3
//        int m = 1;
//        double x = 0.5;
//        int c = 15;
//        double y;
//        y = m*x + c;
//
//        System.out.println(m);
//        System.out.println(x);
//        System.out.println(c);
//        System.out.println(y);

        //task4
        boolean isRaining = true;
        boolean happy = true;

        if(isRaining || happy){
            System.out.println("It's raining and I'm happy");
        }

        if(isRaining || !happy){
            System.out.println("It's raining and I'm not happy");
        }

        if(!isRaining || happy){
            System.out.println("It is not raining and we're happy");
        }

        if(!isRaining || !happy){
            System.out.println("It's not raining and we're not happy");
        }

    }
}

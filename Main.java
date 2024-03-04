import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


//        THIS WAS SECTION ONE BEFORE THE BREAK, TESTING OUT DECLARING THE TYPE OF VARIABLE AND WHAT IMPACT IT HAS ON THE OUTPUT WHEN RUN

//        String message = "What's up doc?";
//
//        int number = 123;
//        double fraction = 5.25;
//
//        int age = 20;
//        string age1 = "20";
//
//        boolean active = true;
//
//        System.out.println("Hello world!");
//        System.out.println(message);
//        System.out.println("*****" + message);
//
//        message = message + "|A";
//        message = message + "|B";
//        message = message.concat("|C");
//
//        System.out.println(message);
//        System.out.println(number);
//        System.out.println(message + number);
//        System.out.println(fraction);
//        System.out.println(number + fraction);
//
//        System.out.println("Age next year will be " + (age + 1));
//        System.out.println("Age next year will be " + (age1 + 1));
//
//        if(active){
//            System.out.println("The account is active.");
//        }
//        else{
//            System.out.println("Account deactivated.");
//        }
//
//        for(int c=0; c<100; c++){
//            System.out.println(c);
//        }





//        NOW THIS IS PART 2 AFTER BREAK at 11 THIS IS MAKING A USER INPUT A USERNAME AND PASSWORD AND CHECKING IF THEY GOT
//        IT RIGHT. USERNAME NOT CASE SENSITIVE, PASSWORD IS

//        testing out the user input feature first:

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a value:");
//        String value = input.nextLine();
//
//        System.out.println("You entered: " + value);




//        now apply it to the username/password task described above:

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter username:");
//        String username = "hello";
//        String usernameinput = input.nextLine();
//        System.out.println("You entered: " + usernameinput);
//
//        String message;
//
//        switch(usernameinput.toLowerCase()){
//            case "hello":
//                message = "Correct username";
//                break;
//            case "abc":
//                message = "Banned value";
//                break;
//            case "def":
//                message = "Banned value";
//                break;
//            case "ghi":
//                message = "Banned value";
//                break;
//            default:
//                message = "Standard response message";
//                break;
//
//        }
//
//        System.out.println(message);
//
//
//        System.out.println("Enter the password:");
//        String password = "abc123";
//        String value1 = input.nextLine();
//
//        if(value1.equals(password)){
//            System.out.println("You entered the correct password!");
//        }
//        else{
//            System.out.println("You entered the wrong password!");
//        }




//        now utilising arrays:

//        String[] valueList = {"A", "B", "C"};
//
//        for(int i=0; i < valueList.length; i++){
//            System.out.println(valueList[i]);
//        }






//        now use this info to do the username in a different way

//        Scanner input = new Scanner(System.in);
//
//        String username = "abc";
//
//        System.out.println(username);
//
//
//        String usernameinput = input.nextLine();
//
//        String[] banned = {"hello", "goodbye", "hi"};
//
//        String message = "Incorrect username";
//
//        if(usernameinput.toLowerCase().equals(username)){
//            message = "Username correct";
//        }
//        else{
//            for(int i=0; i<banned.length; i++){
//                if(usernameinput.toLowerCase().equals(banned[i])){
//                    message = "This username is banned";
//
//                }
//                break;
//            }
//        }
//
//
//        System.out.println(message);




//        how to find an entry of an array and what position it is

//        String[] valueList = {"A", "B", "C", "D", "E"};

//        System.out.println(Arrays.asList(valueList).contains("B"));
//
//        String search = "B";
//
//        int count = 0;
//        for(int i=0; i<valueList.length; i++) {
//            if(valueList[i] == search) {
//                System.out.println(valueList[i] + " found at position " + i);
//                break;
//            }
//        }





//        alternative method but leon literally said dont use it sooooo????

//        String[] valueList = {"A", "B", "C", "D", "E"};
//
//        Stream.of(valueList).anyMatch(val->{
//            System.out.println("="+val);
//            return false;
//        });





//        Can the login be advanced using a while loop? try below: (below is leons code)

//        String[] valueList = {"A", "B", "C", "D", "E"};
//
//        Scanner input = new Scanner(System.in);
//
//        String value = "";
//        boolean loginActive = false;
//
//
//        while(!loginActive) {
//            System.out.println("Enter a Value: ");
//            value = input.nextLine();
//            if(value.equals("ABC")){
//                System.out.println("Correct answer...");
//                loginActive = true;
//            }
////            shortened version of if statement above
////            loginActive = value.equals("ABC"); (this will return true or false, which is what we need)
//        }
//
//        System.out.println("You entered: " + value);




//        messing around with printing out things????

//        String[] valueList = {"A", "B", "C", "D", "E"};
//
//        Stream.of(valueList).anyMatch(val->{
//            System.out.println("=" + val);
//            return false;
//        });
//
//
//
//        for(String item : valueList){
//            System.out.println("*" + item);
//        }



//        testing out difference between int and double when printing and different ways to do so

//        int a = 10;
//        double b = a;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println((double)a);





//        STORYTIME

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("We are going to write a story! Enter your choices and then read your personalised story :)");
//
//
//        System.out.println("Enter a name: ");
//        String name = input.nextLine();
//
//        System.out.println("Enter a creature: ");
//        String creature = input.nextLine();
//
//        System.out.println("Enter a job: ");
//        String job = input.nextLine();
//
//        System.out.println("Enter a past-tense feeling: ");
//        String feeling = input.nextLine();
//
//        System.out.println("Enter a past-tense verb: ");
//        String verb = input.nextLine();
//
//        System.out.println("Enter a shop: ");
//        String shop = input.nextLine();
//
//        System.out.println("Enter a celebrity: ");
//        String celebrity = input.nextLine();
//
//        System.out.println("Enter a past-tense verb: ");
//        String action = input.nextLine();
//
//        System.out.println("Enter a phone helpline: ");
//        String phone = input.nextLine();
//
//        System.out.println("Enter a noun: ");
//        String noun = input.nextLine();
//
//        System.out.println("Enter a location: ");
//        String location = input.nextLine();
//
//        System.out.println("Enter an animal: ");
//        String animal = input.nextLine();
//
//        System.out.println("Enter a home: ");
//        String home = input.nextLine();
//
//
//
//
//
//
//        System.out.println("There once was a child named " + name + ", they lived a normal life. Then one day a " + creature + " came to visit, and told them they were in fact a " + job +  "." + "\n" + " The child was " + feeling + " by the news. They " + verb + " the " + creature +
//                " and ran away. They found a " + shop + " and went in. They saw " + celebrity + " inside, and " + action  + " them. " + "\n" + celebrity + " phoned " + phone + " and asked for a " + noun + "." + "\n" + name + " ran to " + location + " and met a " + animal + " so they " +
//                "stroked it. " + name + " decided to take it home with them, so they built it a " + home + " and it went to sleep in it.");






//        rock paper scissors

        Scanner input = new Scanner(System.in);

        String[] game = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock Paper Scissors!");

        System.out.println("How many round do you want to play?");
        int number = input.nextLine();

        for(int i=1; i<=number; i++){
            System.out.println("Round " + i);
            
            System.out.println("Enter your choice:")
        }


    }
}
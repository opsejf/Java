import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> animalList = new ArrayList<String>();

    public static void addAnimal(String name){
        animalList.add(name);
    };

//    now try do it as arraylist of arraylist so that animals can have details too

    static ArrayList<ArrayList<String> > aList = new ArrayList<ArrayList<String> >();

    public static void addAnimal(String name, String age, String colour){

        ArrayList<String> animal = new ArrayList<String>();
        animal.add(name);
        animal.add(age);
        animal.add(colour);
        aList.add(animal);
    };

//    probs wrong lol
    public static boolean yesOrNo2(){
        Scanner input = new Scanner(System.in);
        String answer = "";

        while(!"yes".equals(answer.toLowerCase()) && !"no".equals(answer.toLowerCase())){
            System.out.println("Please answer yes or no");
            answer = input.nextLine();
            System.out.println("Would you like to add an animal to the list?");
            answer = input.nextLine();
        }


        if(answer.toLowerCase().equals("yes")){

            System.out.println("Please enter the name of the animal you would like to add!");
            String animalName = input.nextLine();



            System.out.println("Would you like to add an animal to the list?");
            return false;
        }
        else{
            System.out.println("No animal will be added to the list.");
            return true;
        }
    }


    public static boolean yesOrNo(){
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if(answer.toLowerCase().equals("yes")){

            System.out.println("Please enter the name of the animal you would like to add!");
            String animalName = input.nextLine();

            System.out.println("Please enter the age of the animal you would like to add!");
            String animalAge = input.nextLine();

            System.out.println("Please enter the colour of the animal you would like to add!");
            String animalColour = input.nextLine();

            addAnimal(animalName, animalAge, animalColour);


            System.out.println("Animals:");
            System.out.println(aList);

//            addAnimal(newAnimal);

            System.out.println("Would you like to add an animal to the list?");
            return false;
        }
        else if(answer.toLowerCase().equals("no")){
            System.out.println("No animal will be added to the list.");
            return true;
        }
        else{
            System.out.println("Please answer yes or no");
            return false;
        }

    };



    public static void main(String[] args) {

        System.out.println("The Animals:");

        addAnimal("dog");
        addAnimal("cat");

        for(int i=0; i< animalList.size(); i++){
            System.out.println(animalList.get(i));
        }

        System.out.println("Would you like to add an animal to the list?");

        yesOrNo();

//        System.out.println("Would you like to add another animal?");

        while(!yesOrNo()){
//            System.out.println("Would you like to add another animal?");
            yesOrNo();
        }


//        System.out.println("Your animal list is:");
//
//        for(int i=0; i< animalList.size(); i++){
//            System.out.println(animalList.get(i));
//        };







    }
}





import java.util.ArrayList;

public class lesson2 {

    //this was included when we started the code below about arrays

    static ArrayList<String> itemList = new ArrayList<String>();


    public static void main(String[] args){

//        part of example 1
//        System.out.println(myPet.test);
//        System.out.println(myPet.getTest());






//        example to show difference between using myPet and otherPet

//        Animal myPet = new Animal();
//        myPet.setTest("XYZ789");
//
//
//        Animal otherPet = new Animal();
//
//        System.out.println(myPet.getTest());
//        System.out.println("    ");
//        System.out.println(otherPet.getTest());





//        example age

//        System.out.println(myPet.getAge());
//        System.out.println(myPet.getAge(5));
//        System.out.println(myPet.getAge(5, 2));




//        example ?????




//        DOG TIME

//        Dog myPet = new Dog();
//
//        Cat otherPet = new Cat();
//
//        System.out.println(myPet.sound);
//        System.out.println(otherPet.sound);



        addItemsToList();
        addItemsToList();


        System.out.println( itemList.get(0));
        System.out.println( itemList.get(1));
        System.out.println( itemList.get(2));


        System.out.println( itemList.size() );








    }


    public static void addItemsToList(){
        itemList.add("one");
        itemList.add("two");
        itemList.add("three");
    }

}

class Animal {
//    this was example 1 publicly
//    public String test1 = "hello";

//    then setting it private to show it needs to be set
//    private String test = "ABC123";

//
//    using this method is better to "grab" test rather than the options above, because if test needs to be updated it
//    will update for all instances

//    String getTest(){
//        return "******" + test;
//    }





//    example to show difference between using myPet and otherPet

//    void setTest(String value){
//        if(value.equals("XYZ789")){
//            value = "!!!!!!!!!!";
//        }
//        test = value;
//    }

//    or this method too???

//    void setTest(String test, int count){
//        if(test.equals("XYZ789")){
//            test = "!!!!!!";
//        }
//        this.test = test;
//    }






//    example ages


//    public int getAge(){
//        return age;
//    }
//
//    public int getAge(int addValue){
//        return age + addValue - 1;
//    }
//
//    public int getAge(int addValue, int multiply){
//        return getAge(addValue) * multiply;
//    }
//
//    public void setAge(int value){
//        age = value;
//    }





//    another example
//    need these functions two functions for it to work first

//    void setTest(String value, int count){
//        if(value.equals("XYZ789")){
//            value = "!!!!!!";
//        }
//        test = value;
//    }
//
//    public void setAge(int value){
//        age = value;
//    }
//
//    private String test = "ABC123";
//    private int age = 0;
//
//    public Animal(){
//    };
//
//    public void Animal(String test, int age){
//        this.test = test; // the this key word ensures it uses this value (for if test is elsewhere i think)
//        this.age = age;
//        //a better way to do the above 2 lines:
//        setTest(test);
//        setAge(age);
//
//    }


//    NOW WE HAVE CAT AND DOG

    public String sound = "silence";


}

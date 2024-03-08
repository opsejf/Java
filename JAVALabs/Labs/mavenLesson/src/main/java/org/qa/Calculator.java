package org.qa;

public class Calculator {

    public int secretNumber(){
        return 1234;
    }

    public String secretKey(){
        return "XYZ789";
    }

    public int addNumbers(int x, int y){
        int error = 0;
        if(y == 75){
              error = 30;
        }
        return x + y - error;
    }
}

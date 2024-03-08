package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        System.out.println("Mult result: " + bc.mult(2, 3));
        try {
            System.out.println("Div result: " + bc.div(6, 0));
        } catch (ArithmeticException ae){
            System.out.println("Calculation error caught");
            // optional additional information
            System.out.println(ae);
            ae.printStackTrace();
        }
    }
}

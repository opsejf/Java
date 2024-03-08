package lambdas;

import java.util.ArrayList;

public class LambdaExample2 {

    public static void main(String[] args) {

        ArrayList<Integer> tempList = new ArrayList<Integer>();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        // Demo 11.07 - Using Lambda Expressions
		/* Previously, to loop through an array list:
			for(int i = 0; i < intList.size(); i++) {
				tempList.add(intList.get(i) + 1);
			}

			or, more commonly:

 			for(int iVal: intList){
				tempList.add(iVal + 1);
			}

		*/

        // Demo 11.08 - Now using Lambdas
        intList.forEach(i -> tempList.add(i + 1));
        // Output the contents of intList & tempList
        System.out.println(intList);
        System.out.println(tempList);

        // Could do any action on each element
        intList.forEach(i -> System.out.println(i));

    }
}

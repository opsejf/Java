package qa;

import java.util.Arrays;

public class D_StringComparisons {

    public static void main(String[] args) {
        String title = "Introduction to Programming with Java";

        if(title.startsWith("Introduction")) {
            System.out.println(title + " is an entry level course");
        }

        System.out.println("Is it a Java course? " + title.endsWith("Java"));

        if(title.contains("Programming")) {
            System.out.println("It looks at aspects of Programming");
        }

        String[] langs = {"Java", "Ruby", "Python", "C#", "C++", "C", "SQL"};
        for(String lang: langs) {
            System.out.println(lang);
        }

        System.out.println(langs[0].compareTo(langs[1]));  				// -ve
        System.out.println(langs[1].compareTo(langs[2]));  				// +ve
        System.out.println(langs[0].compareTo(title.substring(33))); 	// 0

        Arrays.sort(langs);
        for(String lang: langs) {
            System.out.println(lang);
        }
    }
}

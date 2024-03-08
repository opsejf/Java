package qa;

public class C_SubstringSplit {
    public static void main(String[] args) {
        String title = "Introduction to Programming with Java";

        System.out.println(title.length());							// 37

        // return the String starting at a given char index
        // up to but not including an end char index
        System.out.println(title.substring(0, 13)); 				// "Introduction"

        System.out.println(title.substring(33, title.length())); 	// "Java"
        System.out.println(title.substring(33));    				// "Java"
        System.out.println(title.substring(title.indexOf("Java"))); // "Java"

        // retrieve Strings separated by a specific value
        String[] words = title.split(" ");
        for(String word: words) {
            System.out.println(word);
        }

        // if you just want the word at index 2 (3rd word):
        System.out.println(title.split(" ")[2]); // "Programming"

    }

}

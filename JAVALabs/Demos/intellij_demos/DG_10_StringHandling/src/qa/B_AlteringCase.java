package qa;

public class B_AlteringCase {
    public static void main(String[] args) {
        String title = "Introduction to Programming with Java";

        System.out.println(title);
        System.out.println(title.toLowerCase());
        System.out.println(title.toUpperCase());

        System.out.println(title.indexOf("Java"));  // 33
        System.out.println(title.charAt(16));  		// 'P'

        System.out.println(title.charAt(title.indexOf("Java"))); // 'J'

    }


}

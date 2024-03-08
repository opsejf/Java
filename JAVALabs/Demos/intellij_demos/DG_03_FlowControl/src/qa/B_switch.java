package qa;

public class B_switch {
    public static void main(String[] args) {
        // Demo 3.05 - Switch Statement
        // Only works with byte, short, char or int

        int i = 7;
        switch(i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("i is between 3 and 5");
                break;
            default:
                System.out.println("i > 5");
        }

    }


}

public class TestControl {
    public static void main(String[] args) {
        // Ex3-1 Task2-1
        int x = 0;
        while (x < 10) {
            // this can be done in one line
            // or a separate variable can be used to calculate
            // x + 10
            System.out.println("(" + x + ", " + (x + 10) + ")");
            x++;
        }

        System.out.println("**************");

        // Ex3-1 Task2-2
        int n = 1;
        int sum = 1;
        while (n < 10) {
            sum = sum * 2;
            System.out.println("(" + n + ", " + sum + ")");
            n++;
        }

        System.out.println("**************");

        // Ex3-1 Task3
        for (int i = 0; i < 10; i++) {
            System.out.println("(" + i + ", " + (i + 10) + ")");
        }

        System.out.println("**************");

        int sum2 = 1;
        for (int i = 0; i < 10; i++) {
            sum2 = sum2 * 2;
            System.out.println("(" + i + ", " + sum2 + ")");
        }

        System.out.println("**************");

        // Ex3-2 Task1

        int dayOfWeek = 2;

        // assuming the week starts on monday!
        if (dayOfWeek == 1) {
            System.out.println("It's a week day");
        } else if (dayOfWeek == 2) {
            System.out.println("It's a week day");
        } else if (dayOfWeek == 3) {
            System.out.println("It's a week day");
        } else if (dayOfWeek == 4) {
            System.out.println("It's a week day");
        } else if (dayOfWeek == 5) {
            System.out.println("It's a week day");
        } else if (dayOfWeek == 6) {
            System.out.println("It's a weekend");
        } else if (dayOfWeek == 7) {
            System.out.println("It's a weekend");
        } else {
            System.out.println("Not sure where you get days from. Use 1 to 7");
        }

        // an alternative using if

        if (dayOfWeek > 0 && dayOfWeek < 6) {
            System.out.println("It's a week day");
        } else if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println("It's a weekend");
        } else {
            System.out.println("Not sure where you get days from. Use 1 to 7");
        }

        // Ex3-2 Task2-1

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's a week day");
                break;
            case 2:
                System.out.println("It's a week day");
                break;
            case 3:
                System.out.println("It's a week day");
                break;
            case 4:
                System.out.println("It's a week day");
                break;
            case 5:
                System.out.println("It's a week day");
                break;
            case 6:
                System.out.println("It's a weekend");
                break;
            case 7:
                System.out.println("It's a weekend");
                break;
            default:
                System.out.println("Not sure where you get days from. Use 1 to 7");

        }

        // Ex3-2 Task2-2
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a week day");
                break;
            case 6:
            case 7:
                System.out.println("It's a weekend");
                break;
            default:
                System.out.println("Not sure where you get days from. Use 1 to 7");

        }

        System.out.println("***********************");
        // Ex3-2 Task2-3
        for (int i = 1; i < 8; i ++){
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("It's a week day");
                    break;
                case 6:
                case 7:
                    System.out.println("It's a weekend");
                    break;
                default:
                    System.out.println("Not sure where you get days from. Use 1 to 7");

            }
        }

        System.out.println("***********************");

        // Ex3-3 Task1

        for(int year = 1900; year < 2023; year++){
            if ((year % 4 == 0) &&  (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " was a leap year");
            }
        }


    }
}

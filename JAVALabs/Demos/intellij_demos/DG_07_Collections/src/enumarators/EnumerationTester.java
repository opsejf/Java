package enumarators;

import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {

    public static void main(String[] args) {

        // Demo 7.13
        // Legacy - superceded by Iterators but not deprecated
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        days = dayNames.elements();

        while(days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }

        for (String day: dayNames) {
            System.out.println(day);
        }


        EnumSet<MONTHS> spring = EnumSet.of(MONTHS.MAR, MONTHS.APR, MONTHS.MAY);
        EnumSet<MONTHS> summer = EnumSet.of(MONTHS.JUN, MONTHS.JUL, MONTHS.AUG);
        EnumSet<MONTHS> autumn = EnumSet.of(MONTHS.SEP, MONTHS.OCT, MONTHS.NOV);
        EnumSet<MONTHS> winter = EnumSet.of(MONTHS.DEC, MONTHS.JAN, MONTHS.FEB);

        for (MONTHS seasonal: spring) {
            System.out.println(seasonal);
        }

        winter.remove(MONTHS.FEB);
        spring.add(MONTHS.FEB);
        for (MONTHS seasonal: spring) {
            System.out.println(seasonal);
        }

        System.out.println(spring);

    }
    enum MONTHS {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};

}

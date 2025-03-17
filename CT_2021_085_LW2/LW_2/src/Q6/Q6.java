package Q6;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int birthYear=input.nextInt();

        GregorianCalendar cal=new GregorianCalendar();
        int currentYear=cal.get(GregorianCalendar.YEAR);
        int age=currentYear-birthYear;

        System.out.println("You were born on "+birthYear+" and will be "+age+" this year.");


    }
}

package Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length centimeters:");
        float length=input.nextFloat();

        double inches=length/2.54;

        //1feet=12inches
        int feet=(int)inches/12;
        double remaining_inches= (inches%12);

        System.out.println("The length you entered is "+length+"cm");
        System.out.println("Entered cm in inches="+inches+" inches");
        System.out.println("Entered cm in feet="+feet+" feet");
        System.out.println("Remaining inches after converting to feet is"+" "+remaining_inches);

    }
}

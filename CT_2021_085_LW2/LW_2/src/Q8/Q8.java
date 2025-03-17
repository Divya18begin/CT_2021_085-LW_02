package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of sphere:");
        double r = input.nextDouble();

        double volume=(4.0/3)*Math.PI*Math.pow(r,3);

        System.out.println("The volume of the sphere given radius "+r+"is "+volume);

    }
}

package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kg:");
        double weight = input.nextDouble();

        System.out.println("Enter your height in cm:");
        double height = input.nextDouble();

        double bmi = weight / Math.pow((height / 100.0), 2);

        System.out.println("Your BMI is " + bmi);

        if (bmi >= 20 && bmi <= 25) {
            System.out.println("Your BMI value is normal");

        } else {
            System.out.println("Your BMI value is not in the healthy range");

        }
    }
}
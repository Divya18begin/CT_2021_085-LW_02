package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your body weight in kg:");
        double weight=input.nextDouble();
        // 1Kg = 2.20462 lb
        double pounds=weight*2.20462;
        double calories=pounds*19;
        System.out.println("The numbers of calories needed per day:"+calories);
    }
}


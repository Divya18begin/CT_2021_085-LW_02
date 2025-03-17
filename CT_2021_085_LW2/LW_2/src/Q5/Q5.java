package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit:");
        double fahrenheit=input.nextDouble();

        double celsius=(5.0/9)*(fahrenheit-32) ;
        System.out.println("Temperature in celsius:"+celsius);
    }
}

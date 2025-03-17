package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount you invest in dollars:");
        double P = input.nextDouble();

        System.out.println("Enter the annual interest rate:");
        double R= input.nextDouble();

        System.out.println("Enter the number of years for investment:");
        int N = input.nextInt();

        double totalAmount=P*Math.pow(1+(R/100),N);
        System.out.println("Total amount of money earned after "+N+" years is "+totalAmount);
    }
}

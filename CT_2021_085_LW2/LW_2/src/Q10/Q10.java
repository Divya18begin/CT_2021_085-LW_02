package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the loan amount:");
        double loanAmount= input.nextDouble();

        System.out.println("Enter the annual interest rate:");
        double annualInterestRate= input.nextDouble();

        System.out.println("Enter the loan period in years:");
        int loanPeriod= input.nextInt();

        final int MONTHS_IN_YEAR =12;

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;
        System.out.println("_____________________________");// to show the section
        System.out.println("Monthly interest rate: "+monthlyInterestRate);

        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        System.out.println("Number of payments:"+numberOfPayments);
        System.out.println("\n");

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));
        System.out.println("***********Required output**********");//to show the required output
        System.out.println("Monthly payment = "+monthlyPayment);

        double totalPayment = monthlyPayment * numberOfPayments;
        System.out.println("Total payment= "+totalPayment);


    }
}

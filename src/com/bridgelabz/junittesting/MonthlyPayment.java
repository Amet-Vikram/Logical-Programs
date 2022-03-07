package com.bridgelabz.junittesting;

public class MonthlyPayment {

    public static void main(String[] args) {
        int P = Integer.parseInt(args[0]);
        int Y = Integer.parseInt(args[1]);
        double R = Double.parseDouble(args[2]);

        System.out.println("Payment: " + payment(P, Y, R));
    }
    static double payment(int P, int Y, double R){
        int n = 12 * Y;
        double r = R / (12 * 100);
        return (P * r / (1 - Math.pow(((1 + r)), -n)));
    }
}

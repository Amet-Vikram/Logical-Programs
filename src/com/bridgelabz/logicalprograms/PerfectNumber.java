package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        int num = keyboard.nextInt();
        int sum = num/2;
        for (int i = 1; i < num/2; i++) {
            if (num % i == 0 ){
                sum += i;
            }
        }

        if( sum == num ){
            System.out.println("It is a perfect number.");
        }
        else {
            System.out.println("It is not a perfect number.");
        }

    }
}

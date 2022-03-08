package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter the Number to be checked: ");

        int num = keyboard.nextInt();

        System.out.println(primeCheck(num));
    }

    static boolean primeCheck(int n){
        for (int i = 3; i < n/2; i+=2) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}

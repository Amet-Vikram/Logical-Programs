package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number to be reversed: ");
        int num = keyboard.nextInt();
        int last;
        int result = 0;

        while ( num != 0 ){
            last = num % 10;
            result = ( result * 10 ) + last;
            num = Math.floorDiv(num, 10);
        }

        System.out.println("The reversed number is: " + result);

    }

}

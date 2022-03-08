package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class Fibonacci {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the length of fibonacci series: ");
        int len = keyboard.nextInt();
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < len; i++){
            int sum = num1 + num2;
            System.out.println(num1);
            num1 = num2;
            num2 = sum;
        }
    }
}

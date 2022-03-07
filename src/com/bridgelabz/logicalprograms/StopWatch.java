package com.bridgelabz.logicalprograms;


import java.util.Scanner;

public class StopWatch {

    static Scanner keyboard = new Scanner(System.in);
    static long startTime;
    static long stopTime;
    static long elapsedTime;

    static void start(){
        startTime = System.currentTimeMillis();
        System.out.println("Started");
        System.out.println("Press 2 to stop.");

    }

    static void stop(){
        stopTime = System.currentTimeMillis();
        System.out.println("Stopped");
        elapsedTime = stopTime - startTime;
        System.out.println("Time Elapsed: "+(elapsedTime/1000)+" secs");
    }

    public static void main(String[] args) {

        System.out.println("Press 1 to start the watch.");

        while (true){
            System.out.print("Input: ");
            int option = keyboard.nextInt();
            switch (option){
                case 1 -> start();
                case 2 -> {
                    stop();
                    System.exit(0);
                }
                default -> System.out.println("Press the right key");
            }
        }
    }
}

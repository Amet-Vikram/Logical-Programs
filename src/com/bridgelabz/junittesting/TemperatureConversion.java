package com.bridgelabz.junittesting;

public class TemperatureConversion {
    public static void main(String[] args) {
        float far = degToFar(32);
        float deg = farToDeg(70);
        System.out.println(" 32 deg C is " + far + " deg F");
        System.out.println(" 70 deg F is " + deg + " deg C");

    }
   static float degToFar(float temp){
        return (temp * 9 / 5) +32;
   }
   static float farToDeg(float temp){
        return (temp -32) * 5 / 9;
   }
}

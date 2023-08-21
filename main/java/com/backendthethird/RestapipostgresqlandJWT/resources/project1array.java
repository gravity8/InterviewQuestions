package com.backendthethird.RestapipostgresqlandJWT.resources;

import java.util.Scanner;

public class project1array {
    public static void main(String[] args) {
        // Collate data from user
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int numberOfDays = console.nextInt();
        int[] temperatures = new int[numberOfDays];
        int sum =0;

        //Average Temperature
        for(int i=0; i<numberOfDays; i++){
            System.out.println("Enter high temperature for Day "+(i+1)+ ": " );
            temperatures[i]=console.nextInt();
            sum+=temperatures[i];
        }
        int averageTemp = sum/numberOfDays;

        //number of days above average temperature
        int above = 0;
        for(int i = 0; i< temperatures.length; i++){
            if(temperatures[i]>averageTemp){
                above++;
            }
        }
        System.out.println("number of days above average temperature is: "+ above);
    }
}

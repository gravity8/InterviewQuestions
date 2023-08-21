package com.backendthethird.RestapipostgresqlandJWT.resources;

import java.util.Arrays;

public class MaxProductofTwoIntegerInArray {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int firstNumber = 0;
        int secondNumber = 0;
        int i=0;
        int j=1;
        while(j< array.length){
            firstNumber = Math.max(firstNumber,array[j]);
            secondNumber = Math.max(secondNumber,array[i]);
            j++;
            i++;
        }
        System.out.println("The Product is: "+ (firstNumber*secondNumber));
    }

}

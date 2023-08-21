package com.backendthethird.RestapipostgresqlandJWT.resources;

public class MissingNumberIn1to100 {
    public static void main(String[] args) {
        int intArray[]= {1,2,3,4,6,7,8,9,10};
        //input all numbers into the array
        //find the difference between the sum of original array and test array
        int sum1 = 10*(10+1)/2;
        int sum2=0;
        for(int num : intArray){
            sum2+=num;
        }
        int difference= sum1-sum2;
        System.out.println(difference);
    }
}

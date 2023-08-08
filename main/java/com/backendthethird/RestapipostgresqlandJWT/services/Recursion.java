package com.backendthethird.RestapipostgresqlandJWT.services;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(Recursion(15));
        System.out.println(Power(2,2));
        System.out.println((GCD(8,4)));
    }
    public static String Recursion(int n){
        return ("remainder is: "+(n%10));
    }
    public static int Power(int base, int exp){
        if(exp<0) {
            return -1;
        }
        if (exp==0|| exp==1)
            return base;
        return base * Power(base,exp-1);
    }
    public static int GCD(int first, int second){
        if(second==0){
            return first;
        }
        return GCD(second, first%second);
    }
}

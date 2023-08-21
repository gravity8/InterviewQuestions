package com.backendthethird.RestapipostgresqlandJWT.resources;

public class PermutationOfEachOther {
    public static void main(String[] args) {
        int arr1[] = {2,1,3,5,4,6};
        int arr[] = {1,2,4,4,5,6};
        int i=0;
        int j=0;
        int sum = 0;
        int sum1 =0;

        if(arr.length!= arr1.length){
            System.out.println(false);
        }
        else{
            while(i<arr.length){
                sum+=arr[i];
                sum1+=arr1[j];
                i++;
                j++;
            }
        }
        System.out.println(sum==sum1);
    }
}

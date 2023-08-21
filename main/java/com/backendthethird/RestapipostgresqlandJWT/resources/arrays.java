package com.backendthethird.RestapipostgresqlandJWT.resources;

import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        //Two dimensional
        int heights[][] = {{1,3,4,5},{10,20,30,40}};
        System.out.println(Arrays.deepToString(heights));
        for(int row =0; row<heights.length; row++){
            System.out.println("I am on row " +row);
            System.out.println(Arrays.toString(heights[row]));
            for(int col=0; col< heights[0].length; col++){
                System.out.println("done with col "+ col +" and the value there is:"+ heights[row][col]);
            }
        }
    }
}

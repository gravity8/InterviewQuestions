package com.backendthethird.RestapipostgresqlandJWT.resources;

import java.util.HashMap;

public class ElementsinArrayUnique {
    public static void main(String[] args) {
        int array[]= {10,20,30,30};
        boolean Bool = true;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for (int i=0; i<array.length; i++) {
            if(hashmap.containsKey(array[i])){
                Bool = false;
            }
            hashmap.put(array[i],hashmap.getOrDefault(array[i],0)+1);
        }
        System.out.println(Bool);
    }
}

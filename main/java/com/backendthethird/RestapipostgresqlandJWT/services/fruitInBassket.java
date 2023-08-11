package com.backendthethird.RestapipostgresqlandJWT.services;

import java.util.*;

public class fruitInBassket {

    public static void main(String[] args) {
    int[] fruits={3,3,3,1,2,1,1,2,3,3,4};
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int maxCount =0;
        while(i<fruits.length-1){
                map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
                while(map.size() > 2) {
                    map.put(fruits[j], map.get(fruits[j]) - 1);
                    if (map.get(fruits[j]) == 0) {
                        map.remove(fruits[j]);
                    }
                    else {
                        j += 1;
                    }
                }
                maxCount = Math.max(maxCount, i-j +1);
                i++;
        }
        System.out.println(maxCount);

    }

}

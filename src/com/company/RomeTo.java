package com.company;


import java.util.HashMap;
import java.util.Map;


public class RomeTo {

    Map<Integer, String> map = new HashMap<>();


    public int convert(String s) {

        int j = 0;

        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");


        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            if (entry.getValue().equals(s)) {

                return (int) entry.getKey();

            }

        }


        return j;
    }


}





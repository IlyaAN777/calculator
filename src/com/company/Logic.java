package com.company;

import java.util.ArrayList;

public class Logic {

    Arithmetic arithmetic = new Arithmetic();
    RomeTo romeTo = new RomeTo();

    public void log() {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("I");
        arrayList.add("II");
        arrayList.add("III");
        arrayList.add("IV");
        arrayList.add("V");
        arrayList.add("VI");
        arrayList.add("VII");
        arrayList.add("VIII");
        arrayList.add("IX");
        arrayList.add("X");
        arrayList.add("XI");
        arrayList.add("XII");
        arrayList.add("XIII");
        arrayList.add("XIV");
        arrayList.add("XV");
        arrayList.add("XVI");
        arrayList.add("XVII");
        arrayList.add("XVIII");
        arrayList.add("XIX");
        arrayList.add("XX");
        arrayList.add("XXI");
        arrayList.add("XXII");
        arrayList.add("XXIII");
        arrayList.add("XXIV");
        arrayList.add("XXV");
        arrayList.add("XXVI");
        arrayList.add("XXVII");
        arrayList.add("XXVIII");
        arrayList.add("XXIX");
        arrayList.add("XXX");
        arrayList.add("XXXI");
        arrayList.add("XXXII");
        arrayList.add("XXXIII");
        arrayList.add("XXXIV");
        arrayList.add("XXXV");
        arrayList.add("XXXVI");
        arrayList.add("XXXVII");
        arrayList.add("XXXVIII");
        arrayList.add("XXXIX");
        arrayList.add("XL");
        arrayList.add("XLI");
        arrayList.add("XLII");
        arrayList.add("XLIII");
        arrayList.add("XLIV");
        arrayList.add("XLV");
        arrayList.add("XLVI");
        arrayList.add("XLVII");
        arrayList.add("XLVIII");
        arrayList.add("XLIX");
        arrayList.add("L");
        arrayList.add("LI");
        arrayList.add("LII");
        arrayList.add("LIII");
        arrayList.add("LIV");
        arrayList.add("LV");
        arrayList.add("LVI");
        arrayList.add("LVII");
        arrayList.add("LVIII");
        arrayList.add("LIX");
        arrayList.add("LX");
        arrayList.add("LXI");
        arrayList.add("LXII");
        arrayList.add("LXIII");
        arrayList.add("LXIV");
        arrayList.add("LXV");
        arrayList.add("LXVI");
        arrayList.add("LXVII");
        arrayList.add("LXVIII");
        arrayList.add("LXIX");
        arrayList.add("LXX");
        arrayList.add("LXXI");
        arrayList.add("LXXII");
        arrayList.add("LXXIII");
        arrayList.add("LXXIV");
        arrayList.add("LXXV");
        arrayList.add("LXXVI");
        arrayList.add("LXXVII");
        arrayList.add("LXXVIII");
        arrayList.add("LXXIX");
        arrayList.add("LXXX");
        arrayList.add("LXXXI");
        arrayList.add("LXXXII");
        arrayList.add("LXXXIII");
        arrayList.add("LXXXIV");
        arrayList.add("LXXXV");
        arrayList.add("LXXXVI");
        arrayList.add("LXXXVII");
        arrayList.add("LXXXVIII");
        arrayList.add("LXXXIX");
        arrayList.add("XC");
        arrayList.add("XCI");
        arrayList.add("XCII");
        arrayList.add("XCIII");
        arrayList.add("XCIV");
        arrayList.add("XCV");
        arrayList.add("XCVI");
        arrayList.add("XCVII");
        arrayList.add("XCVIII");
        arrayList.add("XCIX");
        arrayList.add("C");

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            arrayList1.add(i);
        }


        if (arrayList.contains(arithmetic.arg1) && arrayList.contains(arithmetic.arg2)) {
            String v = String.valueOf(romeTo.convert(arithmetic.arg1));
            String p = String.valueOf(romeTo.convert(arithmetic.arg2));

            arithmetic.arg1 = v;
            arithmetic.arg2 = p;

            if (arithmetic.calculation(v, p) <= 0) {
                System.err.println("Ошибка! В римской системе исчесления, нет отрацательных чисел и нуля");
                System.exit(0);
            }


            System.out.println(arrayList.get(arithmetic.calculation(v, p) - 1));

        } else if (arrayList1.contains(Integer.parseInt(arithmetic.arg1)) && arrayList1.contains(Integer.parseInt(arithmetic.arg2))) {

            System.out.println(arithmetic.calculation(arithmetic.arg1, arithmetic.arg1));
        } else System.err.println("Ошибка! Калькулятор должен принимать на вход числа от 1 до 10 включительно");


    }


}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Input {
    String s = null;
    ArrayList<String> arrayList2 = new ArrayList<>();
    ArrayList<String> arrayList1 = new ArrayList<>();

    public String[] addToArray() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        arrayList2.add("I");
        arrayList2.add("II");
        arrayList2.add("III");
        arrayList2.add("IV");
        arrayList2.add("V");
        arrayList2.add("VI");
        arrayList2.add("VII");
        arrayList2.add("VIII");
        arrayList2.add("IX");
        arrayList2.add("X");


        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList1.add("4");
        arrayList1.add("5");
        arrayList1.add("6");
        arrayList1.add("7");
        arrayList1.add("8");
        arrayList1.add("9");
        arrayList1.add("10");


        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (s.equals("")) {
            try {
                throw new Exception("Ошибка! Выражение не может быть пустым");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(s);


        String[] words = arrayList.get(0).split(" ");
        if (words.length != 3) {
            try {
                throw new Exception("Ошибка! Необходима вводить два операнда и один оператор (+, -, /, *)");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }
        }

        if (!arrayList2.contains(words[0]) && !arrayList2.contains(words[2]) && !arrayList1.contains(words[0]) && !arrayList1.contains(words[2])) {

            try {
                throw new Exception("Ошибка! Оба числа должны быть от 1 до 10 включительно(от I до X)");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }

        }
        if (arrayList2.contains(words[0]) && arrayList1.contains(words[2]) || arrayList1.contains(words[0]) && arrayList2.contains(words[2])) {
            try {
                throw new Exception("Ошибка! Используются одновременно разные системы счисления");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }

        }

        if (arrayList1.contains(words[0]) && !arrayList1.contains(words[2]) || !arrayList1.contains(words[0]) && arrayList1.contains(words[2]) || arrayList2.contains(words[0]) && !arrayList2.contains(words[2]) || !arrayList2.contains(words[0]) && arrayList2.contains(words[2])) {


            try {
                throw new Exception("Ошибка! Оба числа должны быть от 1 до 10 включительно(от I до X)");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }


        }


        return words;
    }


}
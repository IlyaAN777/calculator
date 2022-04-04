package com.company;

public class Arithmetic {

    Input input = new Input();


    public String[] splitting = input.addToArray();

    public String arg1 = splitting[0];
    public String op = splitting[1];
    public String arg2 = splitting[2];
    int result = 0;

    public int calculation(String a, String b) {
        if (op.equals("+")) {
            return Integer.parseInt(arg1) + Integer.parseInt(arg2);
        }
        if (op.equals("-")) {

            return Integer.parseInt(arg1) - Integer.parseInt(arg2);
        }
        if (op.equals("*")) {

            return Integer.parseInt(arg1) * Integer.parseInt(arg2);
        }
        if (op.equals("/")) {

            return Integer.parseInt(arg1) / Integer.parseInt(arg2);
        } else System.out.println("Ошибка! Не верное арифметическое действие");

        System.exit(0);

        return result;
    }


}









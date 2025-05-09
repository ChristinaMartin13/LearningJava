package com.pluralsight.firstapp;

public class CalcEngine {

    public static void main(String[] args){
        final double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'd';

        double maxValue = value1 > value2 ? value1 : value2;

        System.out.println(maxValue);

        if (opCode == 'a') {
            result = value1 + value2;
        } else if (opCode == 's') {
            result = value1 - value2;
        } else if (opCode == 'm') {
            result = value1 * value2;
        } else if (opCode == 'd') {
        result = value1 / value2;
        } else {
            result = 0.0d;
        }
        System.out.println(result);
        }
    }


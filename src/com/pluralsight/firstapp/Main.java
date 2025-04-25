package com.pluralsight.firstapp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.println("We got organized.");

int valA = 21;
int valB = 6;
int valC = 3;
int valD = 1;


int result1 = valA - valB / valC + valD;
int result2 = (valA - valB) / (valC + valD);

System.out.println(result1);
System.out.println(result2);

var newValue = 200.14;
var newValue2 = (int) newValue;

System.out.println(newValue2);

int someValue = 52;
System.out.println(++someValue);

var someValue2 = 54;
someValue2 -= 10;

System.out.println(someValue2 + someValue);


final var doNotChange = 36;
//doNotChange = 40; since the keyword final is used, the variable type cannot be changed once set.
    }
}
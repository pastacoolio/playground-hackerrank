package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        float tip = (float) (mealCost * tipPercent / 100.0f);
        float tax = (float) (mealCost * taxPercent / 100.0f);
        float total = (float) (mealCost + tip + tax);
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = Math.round(total);

        // Print your result
        System.out.format("The total meal cost is %d dollars.%n", totalCost);
    }
}

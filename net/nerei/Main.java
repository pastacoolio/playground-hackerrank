package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int testCase=0; testCase < testCases; testCase++) {
            int arraySize = in.nextInt();
            int[] arr = new int[arraySize];
            for(int element=0; element<arraySize; element++) {
                if (in.hasNext()) {
                    arr[element] = in.nextInt();
                }
            }
            for(int element=0; element<arraySize-1; element++) {
                if (arr[element+1] < arr[element])
                    System.out.print(arr[element+1]);
                else
                    System.out.print("-1");

                System.out.print(" ");
            }
            System.out.format("-1%n");
        }


        in.close();
    }
}

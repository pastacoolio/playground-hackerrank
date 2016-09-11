package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }
            in.close();

            for(int j=n-1;i>=0; i--) {
                System.out.format("%s ", arr[j]);
            }
        }
    }
}

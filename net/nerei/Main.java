package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            byte n = in.nextByte();

            for (int testCases = 0; testCases < n; testCases++) {
                int prisoners = in.nextInt();
                int sweets = in.nextInt();
                int startId = in.nextInt();

                int newId = (startId + sweets - 1) % prisoners;
                System.out.println(newId);
            }

            in.close();
        }
    }
}

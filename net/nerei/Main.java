package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = in.nextInt();
            for(int testCase=0;testCase<testCases;testCase++) {
                int px=in.nextInt();
                int py=in.nextInt();
                int qx=in.nextInt();
                int qy=in.nextInt();

                System.out.format("%d %d%n", qx+(qx-px), qy+(qy-py));
            }

            in.close();
        }
    }
}

package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            try {
                int num = Integer.parseInt(S);
                System.out.print(num);
            } catch (Exception e) {
                System.out.print("Bad String");
            }

            in.close();
        }
    }
}

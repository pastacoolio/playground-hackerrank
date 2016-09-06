package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dr = in.nextInt();
        int mr = in.nextInt();
        int yr = in.nextInt();
        int de = in.nextInt();
        int me = in.nextInt();
        int ye = in.nextInt();

        int fine;

        if (yr > ye)
            fine = 10000;
        else {
            if (yr < ye) {
                fine = 0;
            } else { // yr == ye
                if (mr < me) {
                    fine = 0;
                } else if (mr > me) {
                    fine = (mr - me) * 500;
                } else { // mr == me
                    if (dr <= de) {
                        fine =0;
                    } else {
                        fine = (dr - de) * 15;
                    }
                 }
            }
        }

        System.out.println(fine);

        in.close();
    }
}

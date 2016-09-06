package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int students = in.nextInt();
            int threshold = in.nextInt();
            int present=0;

            int a[] = new int[students];
            for(int a_i=0; a_i < students; a_i++){
                a[a_i] = in.nextInt();
                if (a[a_i] <= 0)
                    present++;
            }
            if (present < threshold)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

        in.close();
    }
}

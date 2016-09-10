package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* ******************************************
*  Task
*       Given a string, S, of length T that is indexed from 0 to N-1 ,
*       print its even-indexed and odd-indexed characters as
*       2 space-separated strings on a single line (see the Sample
*       below for more detail).
*
*       Note: 0 is considered to be an even index.
*
*       Input Format
*
*           The first line contains an integer, T (the number of test
*           cases). Each line i of the T subsequent lines contain a
*           String, .
*
*       Constraints
*         ° 1 <= T <= 10
*         ° 2 <= length of S <= 10000
*
*       output Format
*           Sor each String Sj (where 0 <= j <= T -1 ), print Sj's
*           even-indexed characters, followed by a space, followed
*           by Sj's odd-indexed characters.
*
****************************************************************/


public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = in.nextInt();
            in.nextLine();
            for (int testCase=0; testCase < testCases; testCase++) {
                char[] text = in.nextLine().toCharArray();

                String evenString = "";
                String oddString= "";

                for (int i=0; i < text.length;i++) {
                    if (i==0 || i % 2 == 0) {
                        evenString+=text[i];
                    } else {
                        oddString+=text[i];
                    }
                }
                System.out.format("%s %s%n", evenString, oddString);
            }
            in.close();
        }
    }
}

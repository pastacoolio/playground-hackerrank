package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        sc.nextLine();


        try {
            try (PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8")) {



                for(int i1=0;i1<testcases;i1++) {
                    int v=0;
                    int w;
                    String line = sc.nextLine();

                    if (line.length() <= 100 && line.length() >= 1) {
                        int t = (v | (v - 1)) + 1;
                        w = t | ((((t & -t) / (v & -v)) >> 1) - 1);

                        writer.println(w);
                    }
                }
                sc.close();

                //writer.println("The second line");
                writer.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
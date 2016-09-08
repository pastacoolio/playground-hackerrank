package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        File file = new File("/home/rl/IdeaProjects/HackerRank/src/net/nerei/testcase1.input.txt");

        try {
            try (Scanner in = new Scanner(file)) {

                try (PrintWriter writer = new PrintWriter("/home/rl/IdeaProjects/HackerRank/src/net/nerei/ouput.txt", "UTF-8")) {

                    while (in.hasNextLine()) {
                        byte n = in.nextByte();

                        for (int testCases = 0; testCases < n; testCases++) {
                            int prisoners = in.nextInt();
                            int sweets = in.nextInt();
                            int startId = in.nextInt();

                            int newId = (startId + sweets - 1) % prisoners;
                            //System.out.println(newId);
                            writer.println(newId);
                        }
                    }
                    in.close();
                }
            }
        } catch (FileNotFoundException|UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

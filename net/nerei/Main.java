package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String []argh){
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            HashMap<String, Integer> phoneBook = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                phoneBook.put(name, phone);
            }
            while (in.hasNext()) {
                String s = in.next();
                // Write code here
                if(phoneBook.containsKey(s)) {
                    System.out.format("%s=%d%n",s,phoneBook.get(s));
                } else {
                    System.out.println("Not found");
                }
            }
            in.close();
        }
    }
}

package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    private static ArrayList<String> permutations(String s) {
        if (s == null) {
            return null;
        }

        ArrayList<String> resultList = new ArrayList<>();

        if (s.length() < 2) {
            resultList.add(s);

            return resultList;
        }

        int length = s.length();
        char currentChar;

        for (int i = 0; i < length; i++) {
            currentChar = s.charAt(i);

            String subString = s.substring(0, i) + s.substring(i + 1);

            ArrayList<String> subPermutations = permutations(subString);

            for (String item : subPermutations) {
                resultList.add(currentChar + item);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();


        for(int i=0;i<t;i++) {
            String s = sc.nextLine();
            ArrayList sorted = permutations(s);
            Collections.sort(sorted);

            ListIterator iter = sorted.listIterator();
            while(iter.hasNext()){
                if((s.compareTo(String.valueOf(iter.next()))) >= 0){
                    iter.remove();
                }
            }

            if (sorted.size() == 0)
                System.out.println("no answer");
            else
                System.out.println(sorted.get(0));

        }
        sc.close();
    }
}

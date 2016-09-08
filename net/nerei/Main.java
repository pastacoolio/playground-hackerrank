package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    private static void swap(char[] arr, int i, int j){
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        try {
            try (PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8")) {



                for(int i1=0;i1<t;i1++) {
                    String line = sc.nextLine();

                    if (line.length() <= 100 && line.length() > 1) {
                        char[] ind = line.toCharArray();

                        //ind is an array of integers
                        for(int tail = ind.length - 1;tail > 0;tail--){
                            if (ind[tail - 1] < ind[tail]){//still increasing

                                //find last element which does not exceed ind[tail-1]
                                int s = ind.length - 1;
                                while(ind[tail-1] >= ind[s])
                                    s--;

                                swap(ind, tail-1, s);

                                //reverse order of elements in the tail
                                for(int i = tail, j = ind.length - 1; i < j; i++, j--){
                                    swap(ind, i, j);
                                }
                                break;
                            }
                        }
                        if (line.compareTo( String.valueOf(ind) ) == 0) {
                            //System.out.println("no answer");
                            writer.println("no answer");
                        } else {
                            //System.out.println(ind);
                            writer.println(ind);
                        }
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
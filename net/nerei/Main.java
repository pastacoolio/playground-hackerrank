package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        short q = in.nextShort();

        int[] a = new int[n];

        for (int i=0; i<n; i++)
            a[(i + k) % n] = in.nextInt();

        try {
            for (int j = 0; j < q; j++) {
                System.out.format("%d%n", a[in.nextInt()]);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        }

        in.close();
    }
}

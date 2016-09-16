package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = in.nextInt();
            for(int i=0;i<testCases;i++){
                int rows = in.nextInt();
                int cols = in.nextInt();

                int[][] grid  = fillArray(in, rows, cols);


                int patternRows = in.nextInt();
                int patternCols = in.nextInt();
                int[][] pattern = fillArray(in, patternRows, patternCols);



                System.out.format("%s: %s%n", "done", getPatternInArray(grid, pattern));
            }



            in.close();
        }
    }

    private static String findPatternInArray(int[][] grid, int[][] pattern) {
        for(int gridrows=0;gridrows < grid.length; gridrows++ ) {
            for(int gridcols=0;gridcols < grid[gridrows].length;gridcols++) {

            }
        }
    }

    private static int[][] fillArray(Scanner in, int rows, int cols) {
        int[][] array = new int[rows][cols];
        in.nextLine();
        for(int r=0;r<rows;r++){
            String s = in.nextLine();
            for(int c=0;c<cols;c++) {
                array[r][c] = Integer.parseInt(Character.toString(s.charAt(c)));
            }
        }
        return array;
    }
}

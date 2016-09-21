package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




public class Main {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    }
}

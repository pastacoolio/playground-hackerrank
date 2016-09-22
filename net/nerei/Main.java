package net.nerei;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Main {

    public static  Node insert(Node head,int data) {
        //Complete this method

        Node temp2 = head;
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        } else {
            // Traverse down to end of the list.
            while (temp2.next != null)
                temp2 = temp2.next;

            // Append at the end of the list.
            temp2.next = newNode;
        }
        return head;
    }


    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

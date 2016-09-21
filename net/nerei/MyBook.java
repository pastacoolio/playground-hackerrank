package net.nerei;

/**
 * Created by rl on 21/09/16.
 */
//Write MyBook Class
class MyBook extends Book
{
    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price=price;
    }

    @Override
    void display() {
        System.out.format("Title: %s%n", super.title);
        System.out.format("Author: %s%n", super.author);
        System.out.format("Price: %s%n", this.price);
    }
}
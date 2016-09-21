package net.nerei;

/**
 * Created by rl on 21/09/16.
 */
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

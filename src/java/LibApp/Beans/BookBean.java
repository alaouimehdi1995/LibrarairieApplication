package Beans;

import java.util.ArrayList;

/**
 * Created by zGuindouOS on 26/12/2016.
 */

public class BookBean {

    private Book book = new Book();
    private ArrayList<Book> books = new ArrayList<Book>();

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public BookBean() {
    }
}

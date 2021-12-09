package com.company;

import library.Book;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book book = new Book("Pushkin", "Lebedy", 123, "Pushkin AS", "@#dfsgsdf123");
        System.out.println(book);
        book.setAuthor("Tolstoi");
        book.setPages(156);
        System.out.println(book.getAuthor());
        System.out.println("All the information about the book: " + book.getAuthor() + " the book needs repair? " + com.company.library.book.isNeedsREpair() + " " + book.getTitle());
    }
}

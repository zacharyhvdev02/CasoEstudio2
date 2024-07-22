package com.mycompany.observer;

import com.mycompany.models.Books;

public class StockObserver implements Observer {
    private Books book;

    public StockObserver(Books book) {
        this.book = book;
        this.book.addObserver(this);
    }

    @Override
    public void update(Books book) {
        System.out.println("Stock of book '" + book.getTitle() + "' has changed. New stock: " + book.getStock());
    }
}

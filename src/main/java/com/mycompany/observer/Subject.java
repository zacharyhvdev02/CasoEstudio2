package com.mycompany.observer;

import com.mycompany.models.Books;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(Books books) {
        for (Observer observer : observers) {
            observer.update(books);
        }
    }
}


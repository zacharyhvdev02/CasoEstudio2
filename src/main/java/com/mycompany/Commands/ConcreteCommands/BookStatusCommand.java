package com.mycompany.Commands.ConcreteCommands;

import com.mycompany.Commands.Command;
import com.mycompany.models.BookState;
import com.mycompany.models.Books;

import javax.swing.*;

public class BookStatusCommand implements Command {
    public Books _book;

    public BookStatusCommand(Books book) {
        this._book = book;
    }

    @Override
    public void execute() {
        if (_book.getState() == BookState.Bueno) {
            JOptionPane.showMessageDialog(null, "El estado del libro es bueno.\n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else if (_book.getState() == BookState.Malo){
            JOptionPane.showMessageDialog(null, "El estado del libro es malo.\n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else if (_book.getState() == BookState.Regular){
            JOptionPane.showMessageDialog(null, "El estado del libro es regular.\n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else if (_book.getState() == BookState.Dañado){
            JOptionPane.showMessageDialog(null, "El estado del libro es dañado.\n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

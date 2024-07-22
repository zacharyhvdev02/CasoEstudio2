package com.mycompany.Commands.ConcreteCommands;

import com.mycompany.Commands.Command;
import com.mycompany.models.Books;

import javax.swing.*;

public class BookStockCommand implements Command {
    private final Books _book;

    public BookStockCommand(Books book) {
        this._book = book;
    }
    @Override
    public void execute() {
        JOptionPane.showMessageDialog(
                null,
                "El stock del libro es " + _book.getStock() + "\n",
                "AVISO",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}

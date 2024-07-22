package com.mycompany.Commands.ConcreteCommands;

import com.mycompany.Commands.Command;
import com.mycompany.models.Books;

import javax.swing.*;

public class BookLendingCommand implements Command {
    private final Books _book;

    public BookLendingCommand(Books book) {
        this._book = book;
    }

    @Override
    public void execute() {
        if (_book.getAvailable() == 0) {
            JOptionPane.showMessageDialog(null, "El libro ya no está disponible\n", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }
}

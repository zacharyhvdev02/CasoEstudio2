package com.mycompany.Commands.ConcreteCommands;

import com.mycompany.Commands.Command;
import com.mycompany.ilib.DAOLendingsImpl;
import com.mycompany.interfaces.DAOLendings;
import com.mycompany.models.Users;

import javax.swing.*;
import java.sql.SQLException;

public class UserLendingCommand implements Command {
    private Users _user;

    public UserLendingCommand(Users user) {
        this._user = user;
    }

    @Override
    public void execute() throws SQLException, ClassNotFoundException {
        DAOLendings userLendings = new DAOLendingsImpl();
        int userLendingsNum = ((DAOLendingsImpl) userLendings).getUserLendings(_user);

        if (userLendingsNum >= 3) {
            JOptionPane.showMessageDialog(null, "Debe devolver libros antes de retirar otro.\n", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }
}

package com.mycompany.Commands;

import java.sql.SQLException;

public interface Command {
    public void execute() throws SQLException, ClassNotFoundException;
}

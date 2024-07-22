package com.mycompany.Commands;

import java.sql.SQLException;

public interface Command {
    void execute() throws SQLException, ClassNotFoundException;
}

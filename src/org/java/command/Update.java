package org.java.command;

import org.java.exceptions.UpdateException;

public class Update implements Command{

    Database db = new Database();

    @Override
    public void exec() {
        db.update();
        throw new UpdateException("update ex");
    }
}

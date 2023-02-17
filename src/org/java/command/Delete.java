package org.java.command;

import org.java.exceptions.DeleteException;

public class Delete implements Command{

    Database db = new Database();

    @Override
    public void exec() {
        db.delete();
        throw new DeleteException("delete ex");
    }
}

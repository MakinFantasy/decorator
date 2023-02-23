package org.java.command;

import org.java.exception.DeleteException;

public class Delete implements Command{
    @Override
    public void exec(Database db) {
        db.delete();
        throw new DeleteException("delete ex");
    }
}

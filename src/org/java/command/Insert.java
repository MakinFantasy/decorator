package org.java.command;

import org.java.exceptions.InsertException;

public class Insert implements Command{
    Database db = new Database();
    @Override
    public void exec() {
        db.insert();
        throw new InsertException("insert ex");
    }
}

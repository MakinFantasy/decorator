package org.java.command;

import org.java.exceptions.SelectException;

public class Select implements Command{

    Database db = new Database();

    @Override
    public void exec() {
        db.select();
        throw new SelectException("select ex");
    }
}

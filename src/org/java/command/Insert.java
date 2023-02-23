package org.java.command;

public class Insert implements Command{
    @Override
    public void exec(Database db) {
        db.insert();
    }
}

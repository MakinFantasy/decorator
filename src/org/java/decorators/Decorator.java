package org.java.decorators;

import org.java.command.Command;
import org.java.exceptions.DeleteException;
import org.java.exceptions.InsertException;
import org.java.exceptions.SelectException;
import org.java.exceptions.UpdateException;

public class Decorator implements Command {
    Command command;
    public Decorator (Command command) {
        this.command = command;
    }

    @Override
    public void exec () {
        try {
            command.exec();
        } catch (DeleteException | SelectException | InsertException | UpdateException ex) {
            StackTraceElement[] stack = ex.getStackTrace();
            for (StackTraceElement el : stack) {
                System.out.println(el);
            }
            throw ex;
        }
    }
}

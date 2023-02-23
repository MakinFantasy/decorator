package org.java.decorator;

import org.java.command.Command;
import org.java.command.Database;

import java.util.Arrays;

public class Decorator implements Command {
    Command command;
    public Decorator (Command command) {
        this.command = command;
    }
    @Override
    public void exec(Database db) {
        try {
            command.exec(db);
            for (StackTraceElement el : new Exception().getStackTrace()) {
                System.out.println(el);
            }
        } catch (RuntimeException ex) {
            for ( StackTraceElement el : ex.getStackTrace()) {
                System.out.println(el);
            }
            throw ex;
        } finally {
            System.out.println("FINISHED");
        }
    }
}
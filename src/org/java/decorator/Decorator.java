package org.java.decorator;

import org.java.command.Command;
import org.java.command.Database;
import org.java.exception.DecoratorException;

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
            throw new DecoratorException("Decor ex");
        } catch (RuntimeException ex) {
            System.out.println("Some exception occurred. Here's your StackTrace");
            StackTraceElement[] throwables = ex.getStackTrace();
            for (StackTraceElement p : throwables) {
                System.out.println(p);
            }
        }
    }
}
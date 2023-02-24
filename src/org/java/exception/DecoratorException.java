package org.java.exception;

import org.java.decorator.Decorator;

public class DecoratorException extends RuntimeException{
    public DecoratorException(String message) {
        super(message);
    }
}

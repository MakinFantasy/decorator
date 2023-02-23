import org.java.command.*;
import org.java.decorator.Decorator;

// only delete command throws Exception


public class Main {
    public static void main(String[] args) {
        Decorator deleteDecorated = new Decorator(new Delete());
        Decorator insertDecorated = new Decorator(new Insert());
        insertDecorated.exec(new Database());
        deleteDecorated.exec(new Database());
    }
}
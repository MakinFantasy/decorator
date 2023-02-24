import org.java.command.*;
import org.java.decorator.Decorator;

// only delete command throws Exception


public class Main {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Delete()); // Decorator decorator = new Decorator (new Insert());
        decorator.exec(new Database());
    }
}
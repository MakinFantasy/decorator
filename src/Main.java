import org.java.command.*;
import org.java.decorators.Decorator;


public class Main {
    public static void main(String[] args) {
        Command decor = new Decorator(new Delete());
        Command nonDecor = new Delete();

        decor.exec();
    }
}
import org.java.decorators.Decorator;
import org.java.command.Delete;
import org.java.command.Update;
import org.java.command.Select;
import org.java.command.Insert;


public class Main {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Delete());
        decorator.printStackTrace();
        decorator = new Decorator(new Insert());
        decorator.printStackTrace();
        decorator = new Decorator(new Select());
        decorator.printStackTrace();
        decorator = new Decorator(new Update());
        decorator.printStackTrace();
    }
}
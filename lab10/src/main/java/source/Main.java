package source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import source.entities.Junior;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("source.entities");

        Programmer programmer = context.getBean(args[0],Programmer.class);
        programmer.doCoding();
    }
}

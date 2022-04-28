package source.entities;

import org.springframework.stereotype.Component;
import source.Programmer;

@Component
public class Middle implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("I'm middle!");
    }
}

package source.entities;

import org.springframework.stereotype.Component;
import source.Programmer;

@Component
public class Junior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("I'm junior!");
    }
}

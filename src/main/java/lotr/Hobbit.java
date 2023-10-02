package lotr;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Hobbit extends Character{

    public Hobbit() {
        super(3, 0);
    }

    public void toCry(){
        System.out.println("I'm crying.");
    }
}


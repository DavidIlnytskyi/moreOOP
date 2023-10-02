package lotr;
import java.util.Random;

public class King extends Character{
    public King(){
        super(new Random().nextInt(10) + 6, new Random().nextInt(10) + 6);
    }

    public void kick(Character oponent){
        oponent.setHp(oponent.getHp() - getPower());
    }
}


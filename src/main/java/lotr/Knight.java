package lotr;

import java.util.Random;

public class Knight extends Character{
    public Knight(){
        super(new Random().nextInt(10) + 6, new Random().nextInt(10) + 6);
    }
}

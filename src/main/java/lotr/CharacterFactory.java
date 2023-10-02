package lotr;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter(){
        Random random = new Random();
        Class<?>[] characters = {Hobbit.class, King.class, Knight.class, Elf.class};
        try {
            return (Character)characters[random.nextInt(4)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }
}

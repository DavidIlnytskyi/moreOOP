package lotr;

import java.util.Random;

public class GameManager {
    private static Character firstPlayer;
    private static Character secondPlayer;

    public static void findOponents(){
        CharacterFactory Factory = new CharacterFactory();
        firstPlayer = Factory.createCharacter();
        secondPlayer = Factory.createCharacter();
    }
    public static void fightPlayers(){
        Random Mykola = new Random();
        while (firstPlayer.isAlive() && secondPlayer.isAlive()){
            if (Mykola.nextInt(100) == 24){
                System.out.println("Mykola's entered\nPlayers are dead");
                break;
            }
            firstPlayer.kick(secondPlayer);
            System.out.println(firstPlayer.getClass().getSimpleName() + " kicked " + secondPlayer.getClass().getSimpleName() + " on " + firstPlayer.getHp() + " health points");
            if (secondPlayer.isAlive()){
                secondPlayer.kick(firstPlayer);
            }
            else if(!secondPlayer.isAlive()){
                System.out.println(secondPlayer.getClass().getSimpleName() + " is dead. Game is over!");
            }
            else if(!firstPlayer.isAlive()){
                System.out.println(firstPlayer.getClass().getSimpleName());
        }
        }
    }
}

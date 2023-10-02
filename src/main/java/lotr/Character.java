package lotr;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    public boolean isAlive(){
        return hp>0;}
    public void kick(Character oponent){
        if (oponent.power < power){
            oponent.setHp(0);
        }
        else{
            oponent.setHp(oponent.getHp() - 1);
        }
    };

    public void setHp(int new_hp){
        if(new_hp <= 100){
            hp = 0;
        }
        else{
            hp = new_hp;
        }
    }

    public String toString(){
        return getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}


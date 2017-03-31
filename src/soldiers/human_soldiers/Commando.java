package soldiers.human_soldiers;

import etc.Coordinates;
import weapons.Weapon;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Commando extends HumanSoldier {
    private static final String TYPE = "Commando" ;
    public int HEALTH = 850;
    public static final int STRENGTH = 12;
    public static final int SPEED = 4;
    Coordinates coordinates = new Coordinates();

    public Commando() {
    }

    public Commando(Coordinates coordinates, Weapon weapon){
        this.coordinates = coordinates;
        this.weapon = weapon;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getTYPE() {
        return TYPE;
    }

    public int getHEALTH() { return HEALTH;    }

    public void setHEALTH(int health) {
        this.HEALTH = health;
    }

    public int getSPEED() {
        return SPEED;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

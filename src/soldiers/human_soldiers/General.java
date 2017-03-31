package soldiers.human_soldiers;

import etc.Coordinates;
import weapons.Weapon;

/**
 * Created by Hrant on 29.03.2017.
 */
public class General extends HumanSoldier{
    private static final String TYPE = "General" ;
    public int HEALTH = 1000;
    public static final int STRENGTH = 10;
    public static final int SPEED = 2;
    Coordinates coordinates = new Coordinates();

    public String getTYPE() {
        return TYPE;
    }


    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Weapon getWeapon() {
        return weapon;
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

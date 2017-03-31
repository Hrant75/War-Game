package soldiers.mystic_soldiers;

import etc.Coordinates;
import weapons.Weapon;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Elf extends MysticSoldier{
    private static final String TYPE = "Elf" ;
    public int HEALTH = 800;
    public static final int STRENGTH = 10;
    public static final int SPEED = 5;

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

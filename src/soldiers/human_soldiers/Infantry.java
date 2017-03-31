package soldiers.human_soldiers;

import etc.Coordinates;
import weapons.Weapon;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Infantry extends HumanSoldier{
    private static final String TYPE = "Infantry" ;
    public int HEALTH = 800;
    public static final int STRENGTH = 7;
    public static final int SPEED = 3;
    private Coordinates coordinates;
    private Weapon weapon;

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

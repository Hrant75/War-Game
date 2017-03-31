package soldiers;

import etc.Coordinates;
import weapons.Weapon;

/**
 * Created by Hrant on 29.03.2017.
 */
public abstract class Soldier  implements Cloneable{
    String RACE;
    String TYPE;
    int HEALTH;
    int STRENGTH;
    int SPEED;
    protected Coordinates coordinates;
    protected Weapon weapon;

    public Soldier() {
    }

    public Soldier(Coordinates coordinates, Weapon weapon){
        this.coordinates = coordinates;
        this.weapon = weapon;
    }

    public Soldier clone() throws CloneNotSupportedException {
        return(Soldier) super.clone();
    }

    public abstract void setCoordinates(Coordinates coordinates);

    public abstract void setWeapon(Weapon weapon);

    public abstract String getRACE();

    public int getSTRENGTH() {        return STRENGTH;    }

    public abstract String getTYPE();

    public abstract int getHEALTH();

    public abstract void setHEALTH(int health);

    public abstract int getSPEED();

    public abstract Coordinates getCoordinates();

    public abstract Weapon getWeapon();
}

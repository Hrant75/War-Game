package weapons.human_weapons;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Shotgun extends HumanWeapon {
    private static final int DAMAGE = 62;
    private static final String NAME = "Shotgun";

    public int getDamage() {
        return DAMAGE;
    }

    public String getName() {
        return NAME;
    }
}

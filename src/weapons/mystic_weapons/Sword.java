package weapons.mystic_weapons;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Sword extends MysticWeapon {
    private static final int DAMAGE = 13;
    private static final String NAME = "Sword";

    public int getDamage() {
        return DAMAGE;
    }

    public String getName() {
        return NAME;
    }
}

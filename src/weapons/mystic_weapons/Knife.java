package weapons.mystic_weapons;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Knife extends MysticWeapon {
    private static final int DAMAGE = 8;
    private static final String NAME = "Knife";

    public int getDamage() {
        return DAMAGE;
    }

    public String getName() {
        return NAME;
    }
}

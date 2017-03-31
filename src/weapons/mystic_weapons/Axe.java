package weapons.mystic_weapons;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Axe extends MysticWeapon{
    private static final int DAMAGE = 15;
    private static final String NAME = "Axe";

    public int getDamage() {
        return DAMAGE;
    }

    public String getName() {
        return NAME;
    }
}

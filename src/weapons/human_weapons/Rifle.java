package weapons.human_weapons;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Rifle extends HumanWeapon {
    private static final int DAMAGE = 37;
    private static final String NAME = "Rifle";

    public int getDamage() {
        return DAMAGE;
    }

    public String getName() {
        return NAME;
    }
}

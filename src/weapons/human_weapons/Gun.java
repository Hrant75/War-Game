package weapons.human_weapons;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Gun extends HumanWeapon {
    private static final int DAMAGE = 18;
    private static final String NAME = "Gun";

    public int getDamage() {
        return DAMAGE;
    }

    public String getName() {
        return NAME;
    }
}

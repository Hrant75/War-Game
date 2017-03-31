package weapons;

/**
 * Created by Hrant on 29.03.2017.
 */
public abstract class Weapon {
    private int DAMAGE;
    private String name;

    public abstract int getDamage();
    public abstract String getName();
}

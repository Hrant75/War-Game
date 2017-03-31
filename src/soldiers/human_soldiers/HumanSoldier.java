package soldiers.human_soldiers;

import etc.Coordinates;
import soldiers.Soldier;
import weapons.Weapon;

/**
 * Created by Hrant on 29.03.2017.
 */
public abstract class HumanSoldier extends Soldier{
    private static final String RACE = "Human";

    public String getRACE() {
        return RACE;
    }
}

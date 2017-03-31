package etc;

import soldiers.Soldier;
import soldiers.human_soldiers.Commando;
import soldiers.human_soldiers.General;
import soldiers.human_soldiers.HumanSoldier;
import soldiers.human_soldiers.Infantry;
import soldiers.mystic_soldiers.Elf;
import soldiers.mystic_soldiers.Orc;
import soldiers.mystic_soldiers.Troll;
import weapons.Weapon;
import weapons.human_weapons.Gun;
import weapons.human_weapons.Rifle;
import weapons.human_weapons.Shotgun;
import weapons.mystic_weapons.Knife;
import weapons.mystic_weapons.Sword;
import weapons.mystic_weapons.Axe;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Game{
    private int boardHeigth;
    private int boardWidth;
    private Soldier[] humanSoldiers;
    private Soldier[] mysticSoldiers;
    private boolean[] isFighting;
    private boolean[] killedHumans;
    private boolean[] killedMystics;

    public Game(int boardHeigth, int boardWidth){
        this.boardHeigth = boardHeigth;
        this.boardWidth = boardWidth;
        isFighting = new boolean[boardHeigth];
        killedHumans = new boolean[boardHeigth];
        killedMystics = new boolean[boardHeigth];
        humanSoldiers = new Soldier[boardHeigth];
        mysticSoldiers = new Soldier[boardHeigth];
    }

    public void start() throws CloneNotSupportedException{
        setSoldiers();
        printPositions();
        moveAndBattle();
    }

    private void moveAndBattle(){
        while (!isWinner()){   //for-y poxel while-i vor xaxy verjana
            for (int i = 0; i < boardHeigth; i++) {
                if(killedHumans[i] || killedMystics[i]) continue;
                if(isFighting[i]) hitOneTime(i);
                else moveOneStep(i);
            }
            printPositions();
        }
    }

    private boolean isWinner(){
        int allKilledHumans = 0;
        int allKilledMystics = 0;
        for(boolean killed : killedHumans)  // calculate how many humans are killed
            if(killed) allKilledHumans++;
        for(boolean killed : killedMystics)// calculate how many mystics are killed
            if(killed) allKilledMystics++;
        if(allKilledHumans > allKilledMystics && allKilledHumans > (boardHeigth / 2) ){
            System.out.println();
            System.out.println(String.format("Mystics won Humans. %d humans killed but only %d mystics was killed", allKilledHumans, allKilledMystics));
            return true;
        }
        if(allKilledMystics > allKilledHumans && allKilledMystics > (boardHeigth / 2) ){
            System.out.println();
            System.out.println(String.format("Humans won Mystics. %d mystics killed but only %d humans was killed", allKilledMystics, allKilledHumans));
            return true;
        }
        return false;
    }

    private void hitOneTime(int i){
        int humanHealth = humanSoldiers[i].getHEALTH() - damageCalculator(mysticSoldiers[i]);
        int mysticsHealth = mysticSoldiers[i].getHEALTH() - damageCalculator(humanSoldiers[i]);
        humanSoldiers[i].setHEALTH(humanHealth);
        mysticSoldiers[i].setHEALTH(mysticsHealth);
        if(humanSoldiers[i].getHEALTH() < 0) {
            humanSoldiers[i].setHEALTH(0);
            killedHumans[i] = true;
        }
        if(mysticSoldiers[i].getHEALTH() < 0) {
            mysticSoldiers[i].setHEALTH(0);
            killedMystics[i] = true;
        }
    }

    private int damageCalculator(Soldier soldier){
        int damage = soldier.getWeapon().getDamage() - soldier.getSTRENGTH();
        if(soldier instanceof HumanSoldier && soldier.getCoordinates().getX() < (boardWidth / 2) )
            damage *= 1.2;
        if(soldier instanceof HumanSoldier && soldier.getCoordinates().getX() > (boardWidth / 2) )
            damage *= 1.2;
        return damage;
    }

    private void moveOneStep(int i){
        int humanX = humanSoldiers[i].getCoordinates().getX() + humanSoldiers[i].getSPEED();
        int mysticX = mysticSoldiers[i].getCoordinates().getX() - mysticSoldiers[i].getSPEED();
        while(true){
            if(humanX == mysticX - 1) {
                isFighting[i] = true;
                break;
            } else
            if(humanX > mysticX) {
                --humanX;
                ++mysticX;
            } else
            if(humanX == mysticX){
                if(humanSoldiers[i].getSTRENGTH() < mysticSoldiers[i].getSTRENGTH()) humanX--;
                else mysticX++;
            } else break;
        }
        humanSoldiers[i].getCoordinates().setX(humanX);
        mysticSoldiers[i].getCoordinates().setX(mysticX);
    }

    private void printPositions(){
        System.out.println();
        System.out.println("positions on board");
        for (int i = 0; i < boardHeigth; i++) {
            System.out.println(humanSoldiers[i].getTYPE() + " with " + humanSoldiers[i].getWeapon().getName() + " health:" + humanSoldiers[i].getHEALTH() + " on " + humanSoldiers[i].getCoordinates() + "     "
                    + mysticSoldiers[i].getTYPE() + " with " + mysticSoldiers[i].getWeapon().getName() + " health:" + mysticSoldiers[i].getHEALTH() + " on " + mysticSoldiers[i].getCoordinates());
        }
    }

    private void setSoldiers() throws CloneNotSupportedException{
        Soldier[] humanSoldierTypes = new Soldier[]{new General(), new Commando(), new Infantry()};
        Soldier[] mysticSoldierTypes = new Soldier[]{new Troll(), new Elf(), new Orc()};
        Weapon[] humanWeaponTypes = new Weapon[]{new Gun(), new Rifle(), new Shotgun()};
        Weapon[] mysticWeaponTypes = new Weapon[]{new Axe(), new Knife(), new Sword()};

        for (int i = 0; i < boardHeigth; i++) {
            humanSoldiers[i] = humanSoldierTypes[randomNumber(0, humanSoldierTypes.length)].clone();
            humanSoldiers[i].setCoordinates(new Coordinates(0, i));
            humanSoldiers[i].setWeapon(humanWeaponTypes[randomNumber(0, humanWeaponTypes.length)]);

            mysticSoldiers[i] = mysticSoldierTypes[randomNumber(0, mysticSoldierTypes.length)].clone();
            mysticSoldiers[i].setCoordinates(new Coordinates(boardWidth - 1, i));
            mysticSoldiers[i].setWeapon(mysticWeaponTypes[randomNumber(0, mysticWeaponTypes.length)]);
        }
        isFighting = new boolean[boardHeigth];
    }

    private int randomNumber(int floor, int roof){
        int randNumber = (int )(Math.random() * roof + floor);
        return  randNumber;
    }
}

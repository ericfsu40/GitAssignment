package edu.fsu.cs.cen4021.armory;

/**
 * Created by Eric on 2/2/2017.
 */
public class SimpleArrow extends BasicWeapon implements Weapon {

    SimpleArrow(){
        super(70);
    }
    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int newArmor = armor - 5;
        if(newArmor <=0){
            return hit();
        }
        int damage = DAMAGE - newArmor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}

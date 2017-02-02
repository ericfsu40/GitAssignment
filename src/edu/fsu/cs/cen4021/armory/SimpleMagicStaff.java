package edu.fsu.cs.cen4021.armory;

/**
 * Created by Eric on 2/2/2017.
 */
public class SimpleMagicStaff extends BasicWeapon implements Weapon {

    SimpleMagicStaff(){
        super(80);
    }
    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        double newArmor = armor * 0.2;
        int damage = DAMAGE - (int)newArmor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}

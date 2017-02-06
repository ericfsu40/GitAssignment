package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.SimpleArrow;
import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        Weapon arrow = WeaponFactory.getWeapon("SimpleArrow");
        Weapon axe = WeaponFactory.getWeapon("SimpleAxe");
        Weapon staff = WeaponFactory.getWeapon("SimpleMagicStaff");
        Weapon chosenAxe = WeaponFactory.getWeapon("TheChosenOneAxe");
        Weapon ancientStaff = WeaponFactory.getWeapon("AncientMagicStaff");
        Weapon webArrow = WeaponFactory.getWeapon("WebRitualArrow");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        System.out.println("SimpleArrow has " + arrow.hit() + " of damage.");
        System.out.println("SimpleAxe has " + axe.hit() + " of damage.");
        System.out.println("SimpleMagicStaff has " + staff.hit() + " of damage.");
        System.out.println("TheChosenOneAxe has " + chosenAxe.hit() + " of damage.");
        System.out.println("AncientMagicStaff has " + ancientStaff.hit() + " of damage.");
        System.out.println("WebRitualArrow has " + webArrow.hit() + " of damage.");
        int armor = 20;
        System.out.println("Sword was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("SimpleArrow was able to do " + arrow.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("SimpleAxe was able to do " + axe.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("SimpleMagicStaff was able to do " + staff.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("TheChosenOneAxe was able to do " + chosenAxe.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("AncientMagicStaff was able to do " + ancientStaff.hit(armor) + " of damage due to an armor with " + armor + " points.");
        System.out.println("WebRitualArrow was able to do " + webArrow.hit(armor) + " of damage due to an armor with " + armor + " points.");
    }
}

package edu.fsu.cs.cen4021.armory;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Eric on 2/2/2017.
 */
public class AncientMagicStaff implements Weapon {

    int DAMAGE;
    AncientMagicStaff(){
        try {
            FileInputStream fileInputStream = new FileInputStream("conf/ancientstaff.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //System.out.print(objectInputStream.readObject().toString());
            List<Integer> thing = (List)objectInputStream.readObject();
            /*for(int i = 0; i<thing.size(); i++){
                System.out.println(thing.get(i));
            }*/
            for(int i = 0; i < thing.size(); i++){
                thing.set(i, (thing.get(i)*thing.get(i)));
            }
            /*for(int i = 0; i<thing.size(); i++){
                System.out.println(thing.get(i));
            }*/
            thing.remove(4);
            thing.remove(1);
            /*for(int i = 0; i<thing.size(); i++){
                System.out.println(thing.get(i));
            }*/
            ArrayList<Integer> finalList =  new ArrayList<Integer>();
            for(int i = 0; i< thing.size(); i++){
                finalList.add(i,thing.get(thing.size()-(i+1)));
            }
            /*
            for(int i = 0; i < finalList.size(); i++){
                System.out.println(finalList.get(i));
            }*/
            DAMAGE = finalList.get(1) + finalList.get(3) + finalList.get(7);

        }catch (FileNotFoundException f){
            f.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }


    }
    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        double newArmor = armor * 0.25;
        int damage = DAMAGE - (int)newArmor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}

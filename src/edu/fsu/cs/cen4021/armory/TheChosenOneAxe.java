package edu.fsu.cs.cen4021.armory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Javier
 */
class TheChosenOneAxe implements Weapon {
    int DAMAGE;

    TheChosenOneAxe() {
        try{
            FileReader fileReader = new FileReader("conf/thechosenone.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            DAMAGE = 2;
            String first = bufferedReader.readLine();
            String line = bufferedReader.readLine();

            //If the different word is in the first or second slot, check the next line to tell which
            if(!(line.equals(first))){

                if(bufferedReader.readLine().equals(first)){
                    DAMAGE = 2;
                    return;
                }else{
                    DAMAGE = 1;
                    return;
                }
            }

            while((line = bufferedReader.readLine()) != null){
                DAMAGE ++;
                if(!(line.equals(first))){
                    System.out.print(line);
                    return;
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if(armor > 0 && armor < 20){
            return hit();
        }
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}

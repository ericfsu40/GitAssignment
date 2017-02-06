package edu.fsu.cs.cen4021.armory;

import java.io.*;
import java.net.*;


/**
 * Created by Eric on 2/2/2017.
 */
public class WebRitualArrow implements Weapon {

    int DAMAGE;

    WebRitualArrow() {
        try {
            URL oracle = new URL("http://ww2.cs.fsu.edu/~escobara/courses/cen4021.html");
            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                //System.out.println(inputLine);
                if(inputLine.startsWith("<h1>") && inputLine.endsWith("</h1>")){
                    inputLine = inputLine.substring(inputLine.indexOf('>')+1,inputLine.lastIndexOf('<'));
                    //System.out.print(inputLine);
                    DAMAGE = Integer.valueOf(inputLine);
                }
            }
            in.close();
        }catch (MalformedURLException m) {
            m.printStackTrace();
        }
        catch (IOException i) {
            i.printStackTrace();
        }

    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    public int hit(int armor) {
        int newArmor = armor - 10;
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

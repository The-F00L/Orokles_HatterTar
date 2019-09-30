package oroklodes;

import fajl.Attributum;
import fajl.Fajl;
import hattertarolo.Floppy;
import hattertarolo.HatterTar;

public class Oroklodes {

    public static void main(String[] args) {

        Fajl f1 = new Fajl("recept","doc");
        System.out.println(f1);
        f1.setTartalom("titok");
        
        System.out.println(f1.getTartalom());
        
        f1.addAttributum(Attributum.titkositott);
        f1.addAttributum(Attributum.archiv);
        
        System.out.println(f1.getTartalom());
        
        System.out.println(f1);
        
        String s = "";
        for (int i = 0; i < 1000; i++) {
            s += "sajttarta";
        }
        
        f1.setTartalom(s);
        System.out.println(f1);
        
        
        
        Fajl f2 = new Fajl("barack","jpg");
        
        HatterTar ht = new HatterTar(800000000);
        ht.addFajl(f1);
        ht.addFajl(f2);
        
        System.out.println(ht);
        
        Floppy flop = new Floppy();
        
        flop.addFajl(f1);
        
        flop.setTol();
        flop.addFajl(f2);
        
        System.out.println(flop);
    }
    
}

package hattertarolo;

import fajl.Fajl;
import java.util.LinkedList;
import java.util.List;

public class HatterTar {
    
    private List<Fajl> fajlRendszer;
    private long meret; 
    
    public HatterTar(long meret){
        this.fajlRendszer = new LinkedList<>();
        
        this.meret = meret;
    }
    
    public long getMaximalisKapacitas(){
        return this.meret;
    }
    
    public long getFoglaltKapacitas(){
        long s = 0;
        
        for (Fajl f : this.fajlRendszer) {
            s += f.getMeret().getMeret();
        }

        return s;
    }
    
    public long getSzabadKapacitas(){
        return this.getMaximalisKapacitas()-this.getFoglaltKapacitas();
    }
    
    public void format(){
        this.fajlRendszer.clear();
    }
    
    public void addFajl(Fajl f){
        if (!this.fajlRendszer.contains(f)){
            this.fajlRendszer.add(f);
        }
    }
    
    public void deleteFajl(Fajl f){
        if (this.fajlRendszer.contains(f)){
            this.fajlRendszer.remove(f);
        }
    }
    
    public Fajl keres(Fajl f){
        int i = 0;
        while (i<this.fajlRendszer.size() 
                && !this.fajlRendszer.get(i).equals(f)){
            i++;
        }
        return i <this.fajlRendszer.size() ? this.fajlRendszer.get(i) : null;
    }
    
    public String listaz(){
        String s = "Fajlrendszer\n";
        for (Fajl f : this.fajlRendszer) {
            s += f + "\n";
        }
        return s;
    }

    @Override
    public String toString() {
        return this.listaz();
    }
    
}
    
    
    
 

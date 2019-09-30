package fajl;

import java.util.LinkedList;
import java.util.List;

public class Fajl {

    private String nev;
    private String kiterjesztes;
    private String tartalom;
    
    private List<Attributum> attributumLista;
    
    public Fajl(String nev, String kiterjesztes){
        this.attributumLista = new LinkedList<>();
        
        this.nev = nev;
        this.kiterjesztes = kiterjesztes;
    }

    public Fajl(String nev, String kiterjesztes, String tartalom) {
        this.attributumLista = new LinkedList<>();

        this.nev = nev;
        this.kiterjesztes = kiterjesztes;
        this.tartalom = tartalom;
    }
    
    public void setTartalom(String s){
        this.tartalom = s;
    }

    public String getTartalom() {
        String s = "";
        
        if (this.attributumLista.contains(Attributum.titkositott)){
            s = "***";
        }else{
            s = this.tartalom;
        }
        
        return s;
    }

    public List<Attributum> getAttributumLista() {
        return this.attributumLista;
    }
    
    public Meret getMeret(){
        Meret m;
        if (this.tartalom != null){
            m = new Meret(this.tartalom.length());
        }
        else{
            m = new Meret(0);
        }
        return m;
    }
    
    public void addAttributum(Attributum a){
        if (!this.attributumLista.contains(a)){
            this.attributumLista.add(a);
        }
    }
    
    public void removeAttributum(Attributum a){
        if (this.attributumLista.contains(a)){
            this.attributumLista.remove(a);
        }
    }

    @Override
    public String toString() {
        String s = this.nev + "." + this.kiterjesztes + " " + this.getMeret().getNormalizalt();

        for (Attributum a : this.attributumLista) {
            s += " " + a.name();
        }

        return s;
    }
    
    
            
    
    
}

package hattertarolo;

import fajl.Fajl;

public class Floppy extends HatterTar {
    
    private boolean toloka;
    
    public Floppy(){
        super(1440000);
        this.toloka = false;
    }

    public void setTol(){
        this.toloka = !this.toloka;
    }
    
    @Override
    public void format() {
        if (!this.toloka){
            super.format();
        }
    }

    @Override
    public void deleteFajl(Fajl f) {
        if (!this.toloka){        
            super.deleteFajl(f); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public void addFajl(Fajl f) {
        if (!this.toloka){        
            super.addFajl(f); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    

    
    
    
    
}

package fajl;

public class Meret {

    private long meret;
    private MertekEgyseg mertekEgyseg;
    
    public Meret(long meret){
        this.meret = meret;
        this.mertekEgyseg = MertekEgyseg.Byte;
    }

    public Meret(long meret, MertekEgyseg mertekEgyseg) {
        this.meret = meret;
        this.mertekEgyseg = mertekEgyseg;
    }

    public long getMeret() {
        return this.meret;
    }
    
    public String getNormalizalt(){
        long m = this.meret;
        int db = 0;
        while (m / 1024 > 0){
            m /= 1024;
            db++;
        }

        MertekEgyseg me = MertekEgyseg.Byte;
        switch (db) {
            case 1: me = MertekEgyseg.KByte; break;
            case 2: me = MertekEgyseg.MByte; break;
            case 3: me = MertekEgyseg.GByte; break;
            case 4: me = MertekEgyseg.TByte; break;
        }
        
        return m + " " + me.name();
    }

    @Override
    public String toString() {
        return this.meret + " " + this.mertekEgyseg;
    }
    
    
    
    

    
}

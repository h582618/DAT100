package uke45;

public class AnsattSamling {
    private Ansatt[] tabell;
    private int nesteLedige;
    
    public AnsattSamling(int storleik) {
        this.tabell = new Ansatt[storleik];
        this.nesteLedige = 0;
    }
    
    private void utvid() {
        Ansatt[] ny = new Ansatt[2 * tabell.length];
        for (int i = 0; i < nesteLedige; i++) {
            ny[i] = tabell[i];
        }
        
        tabell = ny;
    }
    
    public boolean settInn(Ansatt a) {
        int p = finnPos(a.getAnsNr());
                
        if (p == -1) {
            if (nesteLedige == tabell.length) {
                utvid();
            }
            tabell[nesteLedige] = a;
            nesteLedige++;
            return true;
        } else {
            return false;
        }
    }
    
    private int finnPos(int anr) {
        int p = -1;
        int i = 0;
        while (i < nesteLedige && p == -1) {
            if (tabell[i].getAnsNr() == anr) {
                p = i;
            }
            i++;
        }
        return p;
    }
    
    public Ansatt finn(int anr) {
        int p = finnPos(anr);
        if (p >= 0) {
            return tabell[p];
        } else {
            return null;
        }
    }
    
    public boolean slett(int anr) {
        int p = finnPos(anr);
        if (p >= 0) {
            nesteLedige--;
            tabell[p] = tabell[nesteLedige];
            tabell[nesteLedige] = null;
            return true;
        } else {
            return false;
        }
    }
    
    public void visAlle() {
        System.out.println("Antall ansatte: " + nesteLedige);
        for (int i = 0; i < nesteLedige; i++) {
            System.out.println(tabell[i].toString());
        }
    }

}

package Klausur_WS2022.Vererbung;

public class Rätselbuch extends Buch implements IRätsel{


    public boolean isEinmalSpielbar() {
        return einmalSpielbar;
    }

    private  boolean einmalSpielbar;


    public Rätselbuch(String name, int preisInCent, int gewichtInGramm,int seitenanzahl, boolean einmalSpielbar){
        super(name,preisInCent,gewichtInGramm, seitenanzahl);
        this.einmalSpielbar=einmalSpielbar;
    }


}

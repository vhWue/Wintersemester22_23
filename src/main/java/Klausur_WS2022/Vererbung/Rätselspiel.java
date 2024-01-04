package Klausur_WS2022.Vererbung;

public class Rätselspiel extends Artikel implements IRätsel{

    public boolean isEinmalSpielbar() {
        return einmalSpielbar;
    }

    private boolean einmalSpielbar;

    public Rätselspiel(String name, int preisInCent, int gewichtInGramm, int seitenanzahl, boolean einmalSpielbar){
        super(name,preisInCent,gewichtInGramm);
        this.einmalSpielbar=einmalSpielbar;
    }



}

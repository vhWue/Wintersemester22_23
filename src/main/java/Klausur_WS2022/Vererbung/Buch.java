package Klausur_WS2022.Vererbung;

public class Buch extends Artikel{
    private int seitenanzahl;

    public Buch(String name, int preisInCent, int gewichtInGramm, int seitenanzahl){
        super(name,preisInCent,gewichtInGramm);
        this.seitenanzahl=seitenanzahl;
    }

}

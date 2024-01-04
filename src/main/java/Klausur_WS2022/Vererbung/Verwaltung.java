package Klausur_WS2022.Vererbung;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Verwaltung {

    public static List<Artikel> filterArtikel(List<Artikel>  list){

        return list.stream()
                .filter(artikel -> {
                    if (artikel instanceof Rätselspiel) return ((Rätselspiel) artikel).isEinmalSpielbar();
                    if (artikel instanceof Rätselbuch) return ((Rätselbuch) artikel).isEinmalSpielbar();
                    return false;
                })
                .collect(Collectors.toList());




    }


    public static void main(String[] args) {
        Rätselbuch rBuch = new Rätselbuch("Harry Potter",1600,328,128,true);
        Rätselbuch rBuch2 = new Rätselbuch("Fast and Furious",2600,528,428,true);
        Rätselspiel rSpiel = new Rätselspiel("GTA",3600,728,988,false);

        List<Artikel> artikelList  = new ArrayList<>();

        artikelList.add(rBuch);
        artikelList.add(rBuch2);
        artikelList.add(rSpiel);

        List<Artikel> neu = Verwaltung.filterArtikel(artikelList);
        System.out.println(neu.size());
    }
}

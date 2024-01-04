package Klausur_WS2022.Vererbung;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VerwaltungTest {

    Rätselbuch rBuch = new Rätselbuch("Harry Potter",1600,328,128,true);
    Rätselbuch rBuch2 = new Rätselbuch("Fast and Furious",2600,528,428,true);
    Rätselspiel rSpiel = new Rätselspiel("GTA",3600,728,988,false);

    List<Artikel> artikelList  = new ArrayList<>();



    @Test
    void test(){
        artikelList.add(rBuch);
        artikelList.add(rBuch2);
        artikelList.add(rSpiel);

        List<Artikel> neu = Verwaltung.filterArtikel(artikelList);

        assertEquals(2,neu.size());
        assertTrue(neu.contains(rBuch));
        assertTrue(neu.contains(rBuch2));
        assertTrue(!neu.contains(rSpiel));
    }

}
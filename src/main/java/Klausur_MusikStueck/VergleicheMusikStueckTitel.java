package Klausur_MusikStueck;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        return o1.getTitel().compareTo(o2.getTitel());
    }
}

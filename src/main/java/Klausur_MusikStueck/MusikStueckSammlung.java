package Klausur_MusikStueck;

import java.util.*;

public class MusikStueckSammlung {
    public Map<String, MusikStueck> getMap() {
        return map;
    }

    private Map<String,MusikStueck> map;

    public MusikStueckSammlung(){
        map=new HashMap<>();
    }

    void musikStueckEinfuegen(MusikStueck neu) throws IllegalArgumentException{
        if (map.containsKey(neu.titel)) throw new IllegalArgumentException("Dieser Titel existiert bereits");
        else map.put(neu.getTitel(),neu);
    }

    public MusikStueck[] getAlleMusikStueckeNachTitel(){
       List<MusikStueck> list = new ArrayList<>();
       Set<String> keySet = map.keySet();
       keySet.forEach(key-> {
           MusikStueck stueck = map.get(key);
           list.add(stueck);
       });
       list.sort(new VergleicheMusikStueckTitel());
       MusikStueck[] arr = new MusikStueck[list.size()];
       arr= list.toArray(arr);
    return arr;
    }
}

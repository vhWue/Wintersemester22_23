package Versuche.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public Comparator<String> comparator;

    Kreuzwortraetsel(Comparator<String> comparator){
        this.comparator=comparator;
    }

    public static void main(String[] args)
    {

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()<o2.length()) return -1;
                else if (o1.length()>o2.length()) return 1;
                else{
                    return o1.compareTo(o2);
                }
            }
        };

        Comparator<String> lambda =((o1, o2) -> {
            if(o1.length()<o2.length()) return -1;
            else if (o1.length()>o2.length()) return 1;
            else{
                return o1.compareTo(o2);
            }
        });
        Kreuzwortraetsel kreuz = new Kreuzwortraetsel(lambda);

        TreeSet<String> t = new TreeSet<>(kreuz.comparator);
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);




    }
}


package Klausur_MusikStueck;

public class Main {
    public static void main(String[] args) {
        MusikStueck mozart = new MusikStueck("Fuer Elise","Mozart",3);
        MusikStueck bach = new MusikStueck("Vivaldi","bach",4);
        MusikStueck apache = new MusikStueck("Roller","Apache207",3);
       // MusikStueck apache2 = new MusikStueck("Roller","Apache207",4);

        MusikStueckSammlung sammlung = new MusikStueckSammlung();
        sammlung.musikStueckEinfuegen(mozart);
        sammlung.musikStueckEinfuegen(bach);
        sammlung.musikStueckEinfuegen(apache);
       // sammlung.musikStueckEinfuegen(apache2);

        MusikStueck[] kompletteSammlung = sammlung.getAlleMusikStueckeNachTitel();
        for(MusikStueck stueck: kompletteSammlung) {
            System.out.println(stueck+"\n");
        }
    }
}

package Klausur_Vigenere_Verschluesselung;

import java.util.*;

public class Vigenere {
    private String schluessel;




    private HashMap<String, ArrayList<String>> vigenereQuadrat;

    public Vigenere(String schluessel){
        this.schluessel=schluessel;
        this.VigenereGenerator();
    }

    public String getSchluessel(){
        return this.schluessel;
    }
    public HashMap<String, ArrayList<String>> getVigenereQuadrat() {
        return vigenereQuadrat;
    }

    public void setSchluessel(String schluessel){
        this.schluessel=schluessel;
    }

    private void VigenereGenerator(){
        this.vigenereQuadrat = AlphabetShuffler(getAlphabet());
    }

    private static HashMap<String, ArrayList<String>> AlphabetShuffler(ArrayList<String> alph){
        HashMap<String, ArrayList<String>> mixedAlphabet = new HashMap<>();

        alph.forEach(buchstabe->{
            ArrayList<String> temp = new ArrayList<>(alph);
            temp.remove(buchstabe);
            if (!buchstabe.equals("A")){
                Collections.shuffle(temp);
                mixedAlphabet.put(buchstabe,temp);
            }else{
                mixedAlphabet.put(buchstabe,temp);
            }
                });

        return mixedAlphabet;
    }

    private static ArrayList<String> getAlphabet(){
        ArrayList<String> buchstaben = new ArrayList<>();

        for (char buchstabe = 'A'; buchstabe <= 'Z'; buchstabe++) {
            buchstaben.add(String.valueOf(buchstabe));
        }

        return buchstaben;
    }

    private  String repeatKeyText(String text){
        StringBuilder repeatedKey = new StringBuilder();
        int keyIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            // Wenn das Ende des Schlüssels erreicht ist, beginne von vorn
            if (keyIndex == this.schluessel.length()) {
                keyIndex = 0;
            }
            // Füge den aktuellen Buchstaben des Schlüssels zum wiederholten Schlüssel hinzu
            repeatedKey.append(this.schluessel.charAt(keyIndex));
            keyIndex++;
        }
        return repeatedKey.toString();
    }

    public String chiffre(String klartext){
        String klartextFormated = formatString(klartext);
        String verschluesseltRepeated = repeatKeyText(klartextFormated);
        StringBuilder verschluesselt= new StringBuilder();
        ArrayList<String> A_Zeile = this.getVigenereQuadrat().get("A");

        for(int i = 0;i<klartextFormated.length();i++){
            String buchstabe = String.valueOf(klartextFormated.charAt(i));
            String verschluesseltTemp = String.valueOf(verschluesseltRepeated.charAt(i));

            ArrayList<String> Ziel_Zeile = this.getVigenereQuadrat().get(verschluesseltTemp);

            int index_a_zeile = A_Zeile.indexOf(buchstabe);
            if (index_a_zeile==-1){
                verschluesselt.append(" ");
            }else{
                String ziel_value = Ziel_Zeile.get(index_a_zeile);
                verschluesselt.append(ziel_value);
            }


        }




        return verschluesselt.toString();
    }

    //Formatiert einen String so, dass alle Zeichen welche keine Groß oder Kleinbuchstaben sind, mit einem Leerzeichen ersetzt werden
    public String formatString(String str){
        String temp = str.toUpperCase();
        return temp.replaceAll("[^a-zA-Z]"," ");

    }

    public void printVigenere(){
        Set<String> keySet = this.vigenereQuadrat.keySet();

        keySet.forEach(key-> System.out.println(key+" -> "+this.vigenereQuadrat.get(key)));
    }
}

package Klausur_MorseCode;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    public static String[][] tabelle = {
            { "A", ".−"},
            { "B", "−..."},
            { "C", "−.-."},
            { "D", "-.."},
            { "E", "."},
            { "F", "..-."},
            { "G", "--."},
            { "H", "...."},
            { "I", ".."},
            { "J", ".---"},
            { "K", "_._"},
            { "L", ".-.."},
            { "M", "--"},
            { "N", "-."},
            { "O", "---"},
            { "P", ".--."},
            { "Q", "--.-"},
            { "R", ".-."},
            { "S", "..."},
            { "T", "-"},
            { "U", "..-"},
            { "V", "...-"},
            { "W", ".--"},
            { "X", "-..-"},
            { "Y", "-.--"},
            { "Z", "--.."}
    };

    HashMap<String,String> map;

    public Morse(){
        this.map= getMorseCodeMap(tabelle);
    }

    public HashMap<String, String> getMorseCodeMap(String[][] table){
        HashMap<String, String> map = new HashMap<>();
        for (String[] tempArr : table) {
            map.put(tempArr[0], tempArr[1]);
        }
        return map;
    }

    public String zeichenketteToMorse(String s){
        String codiert="";
        for (int i = 0; i < s.length(); i++) {
            String temp = Character.toString(s.charAt(i));
            if(map.containsKey(temp)){
                codiert+=map.get(temp)+"   ";
            }
        }
        return codiert;
    }


    public static void main(String[] args) {
        Morse morsen = new Morse();
        String codiert = morsen.zeichenketteToMorse("KLAUSUR");
        System.out.println(codiert);

    }
}

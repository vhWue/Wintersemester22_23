package Klausur_Vigenere_Verschluesselung;

public class Main {

    public static void main(String[] args) {

        Vigenere vigenere = new Vigenere("TEST");



        String ver = vigenere.chiffre("Hel!loWo0rld");
        System.out.println(ver);

        vigenere.printVigenere();


    }
}

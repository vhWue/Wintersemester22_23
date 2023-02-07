package Klausur_IBAN;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IbanMethods {

    public static Boolean ibanCheck(String iban) throws FalscheIBANException{
        if (iban.length()<22) throw new FalscheIBANException("Die angegebene IBAN "+iban+" hat nicht 22 Zeichen");
        if(!iban.startsWith("DE")) throw  new FalscheIBANException("Die angegebene IBAN "+iban+" hat einen Falschen Ländercode");
        return true;
    }

    public static void ibanAusDateiLesen(String file) throws FalscheIBANException{
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        String iban;
        while((iban= br.readLine())!=null){
            ibanCheck(iban);
        }
        } catch(FileNotFoundException e){
            System.out.println("Datei "+file+ "nicht gefunden");
        }catch (IOException e3){
            System.out.println("Fehler beim Lesevorgang von Datei: "+file);
        }
        catch (NullPointerException e2){
            System.out.println("Datei "+file+" existiert nicht");
        }
    }

    public static void dateienTest(String ...data){

        for (String s : data) {
            try {
                ibanAusDateiLesen(s);
                System.out.println("Alle Ibans in Datei: "+s+" sind gültig");
            } catch (FalscheIBANException e) {
                System.out.println("Falsche Datei: " + s);
            }
        }

    }
}

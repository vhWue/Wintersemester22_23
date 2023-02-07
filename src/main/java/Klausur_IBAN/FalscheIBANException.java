package Klausur_IBAN;

public class FalscheIBANException extends Exception{

    public FalscheIBANException(){
        super("FEHLER: Datei enthält ungültige IBAN");
    }
    public FalscheIBANException(String msg){
        super(msg);
    }
}

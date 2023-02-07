package Klausur_IBAN;

public class Main {
    public static void main(String[] args) {
        try {
            IbanMethods.dateienTest("Files/Iban.txt","Files/Iban2.txt");
        } catch(Exception e){
        e.printStackTrace();
        }
    }
}

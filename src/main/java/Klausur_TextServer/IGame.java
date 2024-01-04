package Klausur_TextServer;

public interface IGame {
    String initGameString();
    String welcomeString();

    String handleInput(String line);

    boolean running();
}

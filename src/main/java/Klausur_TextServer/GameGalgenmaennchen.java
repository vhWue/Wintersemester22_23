package Klausur_TextServer;

public class GameGalgenmaennchen extends Game{
    public String initGameString() {
        return "Game initiated";
    }

    public String welcomeString() {
        return "Hi you are now playing Galgenmaennchen";
    }

    @Override
    public String handleInput(String line) {
        return null;
    }


}

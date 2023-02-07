package Versuche;

import java.io.IOException;
import java.io.Serializable;

public class Bike implements Serializable {
    private String name;
    private double price;
    private String picture;

    public Bike(String name, double price, String picture){
        this.name = name;
        this.price = price;
        this.picture = picture;
    }


    public static void main(String[] args) throws IOException {
        Download bikeDownloader = new Download();
        String pic = "https://images.unsplash.com/photo-1572111504021-40abd3479ddb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1974&q=80";
        Bike b = new Bike("Cube", 300, pic);

        Download.downloadImage(pic, "Biketest.jpg");
    }
}

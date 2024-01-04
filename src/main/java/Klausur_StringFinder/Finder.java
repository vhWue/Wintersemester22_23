package Klausur_StringFinder;

import java.io.*;

public class Finder {
    public BufferedReader getSystemInAsBufferedReader(){
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public void findStringInFiles(String searchString, String[] fileNames) {
        for(String file: fileNames){
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String temp;
            int lineCounter = 1;
            while((temp=br.readLine())!=null){
                if (temp.contains(searchString)){
                    System.out.println("FileName: "+file+"\nZeile: "+lineCounter);
                    break;
                }else{
                    lineCounter++;
                }
            }
            lineCounter=1;
        }catch (IOException e){
            e.printStackTrace();
        }
        }
    }


    public static void main(String[] args) throws IOException {
        Finder finder  = new Finder();

        BufferedReader br = finder.getSystemInAsBufferedReader();
        System.out.println("Geben sie den gesuchten String ein");
        String gesucht = br.readLine();
        String[] fileNames = {"Files/text1.txt","Files/text2.txt"};
        finder.findStringInFiles(gesucht,fileNames);
    }
}

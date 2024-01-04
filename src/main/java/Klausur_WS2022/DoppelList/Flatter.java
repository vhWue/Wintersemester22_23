package Klausur_WS2022.DoppelList;

import java.util.ArrayList;
import java.util.List;

public class Flatter<T> {

    public static List<String> flatter(List<List<String>> multiList){
        List<String> rueckgabe = new ArrayList<>();

        for(List<String> l : multiList){
            for(String item : l){
                rueckgabe.add(item);
            }
        }

        return  rueckgabe;
    }


    public  List<T>  generic(List<List<T>> multiList){
        List<T> rueckgabe = new ArrayList<>();

        for(List<T> l : multiList){
            for(T item : l){
                rueckgabe.add(item);
            }
        }
        return  rueckgabe;
    }

}

package Yazilim_Bilimi;

import java.util.ArrayList;

public class Ders25 {
    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<String>();

        //'add' funksiyasi ile arrayliste elave edirik
        groups.add("Metallica");
        groups.add("Iron Maiden");
        groups.add("Guns' n Roses");
        groups.add("Black Sabbath");

     /*   //'get' funksiyasinin icine almaq istediyimiz index'i yaziriq
        System.out.println("Birinci elemet: " + groups.get(0));
        System.out.println("Ikinci elemet: " + groups.get(1));
        System.out.println("Ucuncu elemet: " + groups.get(2));
        System.out.println("Dorduncu elemet: " + groups.get(3)); */

        //System.out.println("Arraylist'in uzunlugu: " + groups.size());

        for(int i = 0; i<groups.size(); i++){
            System.out.println("Element: " + groups.get(i));
        }
    }
}


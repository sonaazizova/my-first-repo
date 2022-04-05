package Yazilim_Bilimi;

import java.util.ArrayList;

// 'For Each loop' learning
public class Ders26 {
    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<String>();
        int[] arr = {10,20,30,40,50};

        groups.add("Metallica");
        groups.add("Iron Maiden");
        groups.add("Guns' n Roses");
        groups.add("Black Sabbath");
        groups.add("Ramstein");

        for(String s: groups){
            System.out.println("Element groups: " + s);
        }
        for(int i: arr){
            System.out.println("Element arr: " + i);
        }
    }
}

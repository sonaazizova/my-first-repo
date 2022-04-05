package Yazilim_Bilimi;

public class Ders27 {
    public static void main(String[] args) {
        String s1 = "Mustafa";
        String s2 = new String("Mustafa");

        System.out.println("String uzunlugu: " + s2.length());

        System.out.println("0-ci index: " + s2.charAt(0));
        System.out.println("5-ci index: " + s2.charAt(5));
        System.out.println("Sonuncu index: " + s2.charAt(s2.length()-1));

    }
}

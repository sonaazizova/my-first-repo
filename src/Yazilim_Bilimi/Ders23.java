package Yazilim_Bilimi;

import java.util.Scanner;

public class Ders23 {


    public static void mean(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

        }
        System.out.println("Ortalama: " + (double)total / arr.length);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr2 = new int[5];

        System.out.println("Array 2-nin deyerlerini girin: ");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        System.out.println("Arrayin ortalamasi yazilir..");

        mean(arr2);
    }
}

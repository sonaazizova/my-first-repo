package Practice;

import java.util.Scanner;

public class Mesele5 {
    public static void main(String[] args) {
        Scanner daxil = new Scanner(System.in);

        System.out.print("a-ni daxil edin: ");
        int a = daxil.nextInt();

        System.out.print("b-ni daxil edin: ");
        int b = daxil.nextInt();

        System.out.print("c-ni daxil edin: ");
        int c = daxil.nextInt();

        System.out.println("Ededi orta: " + ((a+b+c)/3));

    }
}

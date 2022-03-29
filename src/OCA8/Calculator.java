package OCA8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        String emeliyyat;

        Scanner hesab = new Scanner(System.in);

        System.out.print("a-ni daxil edin: ");
        a = hesab.nextInt();

        System.out.print("b-ni daxil edin: ");
        b= hesab.nextInt();

        Scanner eme = new Scanner(System.in);

        System.out.print("emeliyyati yazin: ");
        emeliyyat = eme.next();
        if(emeliyyat.equals("+")){
            System.out.println("Netice: " + (a + b));
        }
        if(emeliyyat.equals("-")){
            System.out.println("Netice: " + (b - a));
        }
        if(emeliyyat.equals("*")){
            System.out.println("Netice: " + (a * b));
        }
        if(emeliyyat.equals("/")){
            System.out.println("Netice: " + (a / b));
        }
    }
}

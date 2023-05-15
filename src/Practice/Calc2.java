package Practice;

import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci Ededi daxil edin: ");

        int a = sc.nextInt();

        System.out.println("Ikinci Ededi daxil edin: ");

        int b = sc.nextInt();

        System.out.println("Emeliyyati daxil edin: ");

        String emeliyyat = sc.next();

        if (emeliyyat.equals("+")) {
            System.out.println("Netice: " + (a + b));

        }
        if (emeliyyat.equals("-")) {
            System.out.println("Netice: " + (a - b));

        }
        if (emeliyyat.equals("*")) {
            System.out.println("Netice: " + (a * b));

        }
        if (emeliyyat.equals("+")) {
            System.out.println("Netice: " + ((double)a / b));
        }

        }
    }



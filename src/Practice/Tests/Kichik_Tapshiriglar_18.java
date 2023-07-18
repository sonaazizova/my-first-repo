package Practice.Tests;

import java.util.Scanner;

public class Kichik_Tapshiriglar_18 {
    public static void main(String[] args) {
        System.out.print("Ededi daxil edin:  ");

        int d;
        int i;
        Scanner sc = new Scanner(System.in);

        d = sc.nextInt();

        for(i= 0; i<=d; i++){
            if(i%2 == 0 )
                System.out.println(i);
        }

    }
}

class Tek_ededler{
    public static void main(String[] args) {
        System.out.print("Ededi Daxil edin:  ");

        Scanner sc = new Scanner(System.in);

        int i;
        int d;

        d = sc.nextInt();

        for(i = 0 ; i <= d ; i++){
            if(i %2 == 1)
                System.out.println(i);
        }

    }
}


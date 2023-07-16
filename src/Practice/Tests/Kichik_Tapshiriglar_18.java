package Practice.Tests;

import java.util.Scanner;

public class Kichik_Tapshiriglar_18 {
    public static void main(String[] args) {
        System.out.println("daxil edin:");

        int d;
        int i;
        Scanner sc = new Scanner(System.in);

        d = sc.nextInt();

        for(i= 0; i<=d; i++){
            if(i % i == 0 && i % 1 == 0 )
                System.out.println(i);
        }

    }
}

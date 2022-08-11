package Practice;

import java.util.Scanner;

public class Mesele2 {
    public static void main(String[] args) { //((a*a)*x) + (b*x) + c = 0
        int a;
        int b;
        int c;
        int D;

        long x;
        Scanner daxil = new Scanner(System.in);

        System.out.print("a-ni daxil edin: ");
        a = daxil.nextInt();

        System.out.print("b-ni daxil edin: ");
        b = daxil.nextInt();

        System.out.print("c-ni daxil edin: ");
        c = daxil.nextInt();

        D = (b*b) - (4*a*c);
        if(D<0){
            System.out.println("Tenliyin hegigi koku yoxdur");
        }
        else if(D>0){
            System.out.println("Tenliyin birinci koku : " + ((-b - Math.sqrt(D))/2*a));
            System.out.println("Tenliyin ikinci koku : " + ((-b + Math.sqrt(D))/2*a));
        }
    }
}

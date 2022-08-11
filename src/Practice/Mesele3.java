package Practice;

import java.util.Scanner;

public class Mesele3 {

    public static void main(String[] args) {

        Scanner daxil = new Scanner(System.in);

        System.out.print("a-ni daxil edin: ");
        int a = daxil.nextInt();

        System.out.print("b-ni daxil edin: ");
        int b = daxil.nextInt();

        System.out.print("c-ni daxil edin: ");
        int c = daxil.nextInt();

        if(a>b && a>c){
            System.out.println("En boyuk : " + a);
        }
        else if(c>b && c>a){
            System.out.println("En boyuk : " + c);
        }
        else if (b>a && b>c){
            System.out.println("En boyuk : " + b);
        }
        else{
            System.out.println("Minimum bir regem sifirdan boyuk olmalidi");
        }

    }

}

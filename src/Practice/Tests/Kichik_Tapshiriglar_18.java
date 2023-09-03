package Practice.Tests;

import Yazilim_Bilimi.ATM_practice;

import java.util.Scanner;

public class Kichik_Tapshiriglar_18 {
    public static void main(String[] args) {
        System.out.print("Ededi daxil edin:  ");

        int d;
        int i;
        Scanner sc = new Scanner(System.in);

        d = sc.nextInt();

        for (i = 0; i <= d; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }
}

class Tek_ededler {
    public static void main(String[] args) {
        System.out.print("Ededi Daxil edin:  ");

        Scanner sc = new Scanner(System.in);

        int i;
        int d;

        d = sc.nextInt();

        for (i = 0; i <= d; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }

    }
}

class Regemlerin_sayi {
    public static void main(String[] args) {

        String i;
        System.out.print("Ededi daxil edin:  ");

        Scanner sc = new Scanner(System.in);

        i = sc.next();

        System.out.println("Ededin regemlerinin sayi: " + i.length());

    }
}

class HackerRank2 {
    public static void main(String[] args) {

        System.out.print("Input n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 1) {
            System.out.println("Weird");
        }
        else if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        }
        else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        }
        else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }

    }
}

class any{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        System.out.println(ATM_practice.FindFaktorial(value));


    }

    }
class Airplane {
    static int start = 2;
    final int end;
    public Airplane(int x) {
        x = 4;
        end = x;
    }
    public void fly(int distance) {
        System.out.print(end-start+" ");
        System.out.print(distance);
    }
    public static void main(String... start) {
        new Airplane(10).fly(5);
    }
}
class Kuruyemis {
    public void goruntu()
    {
        System.out.println("Kuruyemişler");
    }
}
//Override ederek sınıflarımızı oluşturduk ve içlerine metotlarımızı tanımladık.
class Fındık extends Kuruyemis
{
    @Override
    public void goruntu() {
        System.out.println("Fındık (Tadı güzelmiş he)");
    }
}
class Ceviz extends Kuruyemis
{
    @Override
    public void goruntu() {
        System.out.println("Ceviz");
    }
}

class Main
{
    public static void main(String[] args)
    {

        //kuruyemis sınıfından bir nesne oluşturduk
        Kuruyemis kryms = new Kuruyemis();
        kryms.goruntu();

        //Fındık sınıfından bir nesne oluşturduk.
        Fındık fndk = new Fındık();
        fndk.goruntu();

        //Ceviz sınıfından bir nesne oluşturduk.
        Ceviz cvz = new Ceviz();
        cvz.goruntu();

    }
}
class elebele{
    static int a = 12, b = 3;


    public static int verilenEdediTap(int i){
        i = a - b;
        return i;
    }

    public static void main(String[] args) {
        System.out.println(verilenEdediTap(0));

    }
}

package Practice.Tests;

import java.util.Scanner;

public class a11_Linkdeki_Tapshiriglar {

    //1. Write a Java program to get a number from the user and print whether it is positive or negative.

    public static void main(String[] args) {
        int i = 0;
        System.out.print("Input number: ");

        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        if (i < 0)
            System.out.println("Number is negative");

        else if (i > 0)
            System.out.println("Number is positive");

        else
            System.out.println("Number is zero");

    }
    //2. Write a Java program to solve quadratic equations (use if, else if and else).
    //-------------------------------------------------------------------------
}

class En_Boyuk_eded {

    //3. Write a Java program that takes three numbers from the user and prints the greatest number.

    int a, b, c;

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        a = sc.nextInt();

        System.out.print("Input the 2nd number: ");
        b = sc.nextInt();

        System.out.print("Input the 3rd number: ");
        c = sc.nextInt();

        if (a > b && b > c)
            System.out.println("En Boyuk eded: " + a);

        else if (b > a && a > c)
            System.out.println("En Boyuk eded: " + b);

        else if (c > a && a > b)
            System.out.println("En Boyuk eded: " + c);
    }
}
//4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

class Heftenin_gunleri { // if- else ile

    //5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

    public static void main(String[] args) {

        int gunler;

        Scanner sc = new Scanner(System.in);
        System.out.print("Gunu daxil edin: ");

        gunler = sc.nextInt();

        if (gunler == 1)
            System.out.println("Bazar ertesi");

        else if (gunler == 2)
            System.out.println("chershenbe axshami");

        else if (gunler == 3)
            System.out.println("chershenbe");

        else if (gunler == 4)
            System.out.println("Cume axshami");

        else if (gunler == 5)
            System.out.println("Cume");

        else if (gunler == 6)
            System.out.println("Shenbe");

        else if (gunler == 7)
            System.out.println("Bazar");

        else
            System.out.println("Heftede 7 gun olur!!");

    }
}

class Heftenin_gunleri2 { // Switch- Case ile

    //5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

    public static void main(String[] args) {
        int gunler;

        Scanner sc = new Scanner(System.in);
        System.out.print("Gunu daxil edin: ");
        gunler = sc.nextInt();

        switch (gunler) {

            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("chershenbe axshami");
                break;
            case 3:
                System.out.println("chershenbe");
                break;
            case 4:
                System.out.println("Cume axshami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Shenbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Heftede 7 gun olur!!!");
        }
    }
}


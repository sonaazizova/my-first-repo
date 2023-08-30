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
//6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

//7. Write a Java program to find the number of days in a month.

//8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.


class Il_chixama { //9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
    public static void main(String[] args) {
        int il;

        System.out.println("Sichramaq istediyiniz ili geyd edin: ");
        Scanner sc = new Scanner(System.in);

        il = sc.nextInt();

        System.out.println(il + " is a leap year");
    }
}
//10. Write a Java program to display the first 10 natural numbers.

class A10cu_Tapshirig { //11. Write a Java program to display n terms of natural numbers and their sum.

    public static void main(String[] args) {
        int i, n, sum = 0;
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
            n = in.nextInt();
        }
        System.out.println("The first n natural numbers are : " + n);

        for (i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto " + n + " terms : " + sum);

    }
}

class Topluyub_sayina_bol {//12. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

    public static void main(String[] args) {

        int n;
        int a;
        double b = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Input the " + n + " numbers: ");

        for (a = 1; a <= n; a++) {
            System.out.println(a);
            b += a;
        }
        System.out.println("The sum of " + n + " no is : " + b);

        System.out.println("The Average is: " + (b / n));
    }
}

class Kuba_yukseltme {//13. Write a Java program to display the cube of the given number up to an integer.

    public static void main(String[] args) {
        int n;
        int a;

        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (a = 1; a <= n; a++) {
            System.out.println("Number is : " + a + " and cube of " + a + " is : " + (a * a * a));

        }
    }
}

class Vurma_Cedveli { //14. Write a Java program to display the multiplication table of a given integer.

    public static void main(String[] args) {

        int n;
        int a;
        int sum = 1;
        System.out.print("Input the  number of terms : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        for (a = 0; a <= n; a++) {
            System.out.println(n + " X " + a + " = " + (a * n));

        }
    }
}

class Tek_ededler2 {
    public static void main(String[] args) {
        System.out.print("Input number of terms is: ");
        int i;
        int a;
        int sum= 0;

        Scanner scanner = new Scanner(System.in);

        i = scanner.nextInt();
        System.out.println("The odd numbers are: " );
        for (a = 1; a <= i; a++) {
            System.out.println((a * 2 - 1));
            sum += a*2-1;

        }
        System.out.println("The Sum of odd Natural Number upto "+i+ " terms is: " + sum);
    }
}




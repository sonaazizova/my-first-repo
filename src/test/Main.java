package test;

import static test.Student.*;

public class Main {
    public static void main(String args[]) {

        int a;

        for (a = 1; a <= 15; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (a % 3 == 0 && a % 5 != 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0 && a % 3 != 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(a);
            }
        }
    }
}



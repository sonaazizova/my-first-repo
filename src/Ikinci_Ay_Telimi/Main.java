package Ikinci_Ay_Telimi;

import beans.Students;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What do you want to do?" +
                    "\n1. Register Student " +
                            "\n2. Show All Students" +
                            "\n3. Find Stuent" +
                            "\n4. Update Student" + "\n");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        if (menu == 1){
            sc = new Scanner(System.in);
            System.out.println("Enter name:");
            String name  = sc.nextLine();

            sc= new Scanner(System.in);
            System.out.println("Enter surname");
            String surname = sc.nextLine();

            sc = new Scanner(System.in);
            System.out.println("Enter age");
            int age = sc.nextInt();

            sc = new Scanner(System.in);
            System.out.println("Enter Class:");
            String ClassName  = sc.nextLine();

            System.out.println("" + name + " " + surname + " registired sucsesfully");

            Students st = new Students(name, surname, age, ClassName);
        }
    }
}

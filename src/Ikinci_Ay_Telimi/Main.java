package Ikinci_Ay_Telimi;

import beans.Students;
import util.InputUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu = InputUtil.requireNumber("What do you want to do?" +
                "\n1. Register Student " +
                "\n2. Show All Students" +
                "\n3. Find Stuent" +
                "\n4. Update Student" + "\n");

        if (menu == 1) {

            int count = InputUtil.requireNumber("Neche telebe qeydiyyatdan kechib?");
            Config.students = new Students[count];

            for (int i = 0; count > i; i++) {
                System.out.println((i+1) + ". Register");

                String name = InputUtil.requireText("Enter name");
                String surname = InputUtil.requireText("Enter surname");
                int age = InputUtil.requireNumber("Enter age");
                String className = InputUtil.requireText("Enter class");

                System.out.println("" + name + " " + surname + " registired sucsesfully");

                Students st = new Students(name, surname, age, className);

                Config.students[i] = st;
            }
            System.out.println("Registration completed succsesfully");
            for (int i = 0 ; i<Config.students.length ; i++){
                Students st = Config.students[i];
                System.out.println(st.getName() + "" + st.getSurname() + "" + st.getAge() + "" + st.getClassName());

            }

        }
    }
}

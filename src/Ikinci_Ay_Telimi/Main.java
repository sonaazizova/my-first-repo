package Ikinci_Ay_Telimi;

import beans.Students;
import util.InputUtil;
import util.StudentUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu = InputUtil.requireNumber("What do you want to do?" +
                "\n1. Register Student " +
                "\n2. Show All Students" +
                "\n3. Find Stuent" +
                "\n4. Update Student" + "\n");

        if (menu == 1) {
            StudentUtil.registerStudents();
        } else if (menu == 2) {
            StudentUtil.printAllRegisteredStudents();
        } else if (menu == 3) {
            String text = InputUtil.requireText("Type name, surname or class name");
            for (int i = 0; i < Config.students.length; i++) {
                Students st = Config.students[i];
                if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
                    System.out.println(st.getFullInfo());
                }
            }
        }
    }
}

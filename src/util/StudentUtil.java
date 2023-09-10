package util;

import Ikinci_Ay_Telimi.Config;
import beans.Students;

public class StudentUtil {
    public static Students fillStudent() {
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        int age = InputUtil.requireNumber("Enter age");
        String className = InputUtil.requireText("Enter class");

        Students st = new Students(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents() {
        if( Config.students == null){
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Students st = Config.students[i];
            System.out.println(st.getName() + "" + st.getSurname() + "" + st.getAge() + "" + st.getClassName());
        }
    }
    public static void registerStudents(){
        int count = InputUtil.requireNumber("Neche telebe qeydiyyatdan kechib?");
        Config.students = new Students[count];
        for (int i = 0; count > i; i++) {
            System.out.println((i+1) + ". Register");
            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("Registration completed succsesfully");
        StudentUtil.printAllRegisteredStudents();
    }
}

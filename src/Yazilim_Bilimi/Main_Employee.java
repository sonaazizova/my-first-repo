package Yazilim_Bilimi;

public class Main_Employee {
    public static void main(String[] args) {

       /* Employee employee = new Employee("Akif Azizov", "IT", 3000);

        employee.showInfos();*/

        Manager_Employee manager_employee = new Manager_Employee("Akif Azizov", "IT", 3500,20);

        manager_employee.showInfos();
        manager_employee.raiseSalary(250);

    }

}

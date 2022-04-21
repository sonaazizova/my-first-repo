package Yazilim_Bilimi;

public class Manager_Employee extends Employee {

    private int num_of_employees; // ishci sayi

    public Manager_Employee(String name, String department, int salary, int num_of_employees) {

        super(name, department, salary);
        this.num_of_employees = num_of_employees;
    }
    public void raiseSalary(int amount){
        System.out.println("Ishcilerin maashina " + amount + "manat elave dedildi..");
    }
}

package Yazilim_Bilimi;

public class Employee {  // Ishchi
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public void showInfos() {
        System.out.println("Bilgiler: ");
        System.out.println("Adi: " + this.name);
        System.out.println("Söbə: " + this.department);
        System.out.println("maashi: " + this.salary);

    }
}


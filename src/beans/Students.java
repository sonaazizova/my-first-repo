package beans;

public class Students {
    private String name;
    private String surname;
    private int age;
    private String ClassName;


    public Students() {
    }

    public Students( String name, String surname , int age, String ClasName){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ClassName = ClasName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }
}

